class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i < numbers.length; i++) {
            min = Math.min(min, Integer.parseInt(numbers[i]));
            max = Math.max(max, Integer.parseInt(numbers[i]));
        }
        return min + " " + max;
    }
}