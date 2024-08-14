import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
        int[] dp = new int[4];
		int[] temp;

		for (int i = 0; i <land.length; i++) {
			temp = dp.clone();
			for (int j = 0; j < 4; j++) {
				int max = Integer.MIN_VALUE;
				for (int k = 0; k < 4; k++) {
					if (k != j) {
						max = Math.max(max, temp[k]);
					}
				}
				dp[j] = max + land[i][j];
			}
		}

		return Arrays.stream(dp).max().getAsInt();
    }
}