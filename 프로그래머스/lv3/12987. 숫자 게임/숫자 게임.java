import java.util.Arrays;


class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		int lt = 0, rt = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[lt] > B[rt]) {
				rt++;
			} else if (A[lt] == B[rt]) {
				rt++;
			} else {
				lt++;
				rt++;
				answer++;
			}
		}

		return answer;
    }
}