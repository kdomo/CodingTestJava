class Solution {
    public String solution(int num) {
        String answer = Math.abs(num) % 2 == 1 ? "Odd" : "Even";
		return answer;
    }
}