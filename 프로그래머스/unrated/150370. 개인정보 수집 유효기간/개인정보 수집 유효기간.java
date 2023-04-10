import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
		int date = convertDateToNumber(today);

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < terms.length; i++) {
			String[] term = terms[i].split(" ");
			map.put(term[0], Integer.parseInt(term[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");

			if (convertDateToNumber(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
				answer.add(i + 1);
			}
		}
		return answer.stream().mapToInt(i -> i).toArray();
	}

	private int convertDateToNumber(String today) {
		String[] date = today.split("\\.");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		return (year * 12 * 28) + (month * 28) + day;
	}
}