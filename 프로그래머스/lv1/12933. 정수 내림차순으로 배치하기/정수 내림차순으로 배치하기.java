import java.util.Arrays;

class Solution {
    public long solution(long n) {
		StringBuilder sb = new StringBuilder();

		String[] split = String.valueOf(n).split("");
		int length = split.length;
		Arrays.sort(split);

		for (int i = length - 1; i >= 0; i--) {
			sb.append(split[i]);
		}

		return Long.parseLong(sb.toString());
    }
}