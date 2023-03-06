class Solution {
    boolean solution(String s) {
        String[] split = s.toLowerCase().split("");
		int pCnt = 0;
		int yCnt = 0;

		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("p")) {
				pCnt++;
			} else if (split[i].equals("y")) {
				yCnt++;
			}
		}

		if (pCnt == yCnt) {
			return true;
		}
		return false;
    }
}