import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
		HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

		// music Hash Map에 입력받은 데이터 정리해서 넣기
		// {pop={1=600, 4=2500}, classic={0=500, 2=150, 3=800}}
		for (int i = 0; i < genres.length; i++) {
			if (music.containsKey(genres[i])) {
				music.get(genres[i]).put(i, plays[i]);
			} else {
				HashMap<Integer, Integer> map = new HashMap<>();
				map.put(i, plays[i]);
				music.put(genres[i], map);
			}
			music.put(genres[i], music.getOrDefault(genres[i], new HashMap<>()));
		}

		// music Hash Map에 Key 값들을 keySet에 저장
		List<String> keySet = new ArrayList<>(music.keySet());

		// 합계가 제일 큰게 앞으로 오도록 정렬
		Collections.sort(
				keySet,
				(s1, s2) -> music.get(s2).values().stream().mapToInt(Integer::intValue).sum()
						- music.get(s1).values().stream().mapToInt(Integer::intValue).sum()
		);

		// 정렬된 key값을 이용해 plays수 가 큰 순서대로 정렬
		for(String key: keySet) {
			List<Integer> list = new ArrayList<>(music.get(key).keySet());
			Collections.sort(list, (s1, s2) -> music.get(key).get(s2) - music.get(key).get(s1));
			
			//앞에서 2개만 가져오기
			answer.add(list.get(0));
			if (list.size() > 1) {
				answer.add(list.get(1));
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}