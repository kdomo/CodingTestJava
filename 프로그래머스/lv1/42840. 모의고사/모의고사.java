import java.util.*;

class Solution {
    public static int[] personA = {1, 2, 3, 4, 5};
	public static int[] personB = {2, 1, 2, 3, 2, 4, 2, 5};
	public static int[] personC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public int[] solution(int[] answer) {
        int[] score = new int[3];

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == personA[i % personA.length]) score[0]++;
			if (answer[i] == personB[i % personB.length]) score[1]++;
			if (answer[i] == personC[i % personC.length]) score[2]++;
		}

		int max = Math.max(score[0], Math.max(score[1], score[2]));
		List<Integer> list = new ArrayList<>();

		if (max == score[0]) list.add(1);
		if (max == score[1]) list.add(2);
		if (max == score[2]) list.add(3);

		return list.stream().mapToInt(Integer::intValue).toArray();
    }
}