class Solution {
  public int[] solution(long n) {
    	String str = String.valueOf(n);
		String[] split = str.split("");
		int[] answer = new int[split.length];

        for (int i = split.length - 1; i >= 0; i--) {
			answer[split.length - 1 - i] = Integer.parseInt(split[i]);
		}
		return answer;
  }
}