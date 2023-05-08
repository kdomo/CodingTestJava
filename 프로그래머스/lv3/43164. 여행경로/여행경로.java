import java.util.*;

class Solution {
	static ArrayList<String> list = new ArrayList<>();
	static boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
		dfs(tickets, "ICN", "ICN", 0);
		Collections.sort(list);
		return list.get(0).split(" ");
	}

	private void dfs(String[][] tickets, String cur, String path, int depth) {
		if (depth == tickets.length) {
			list.add(path);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			if (!visited[i] && tickets[i][0].equals(cur)) {
				visited[i] = true;
				dfs(tickets, tickets[i][1], path + " " + tickets[i][1], depth+1);
				visited[i] = false;
			}
		}
	}
}