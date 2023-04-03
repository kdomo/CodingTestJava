import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};

		int N = maps.length;
		int M = maps[0].length;
		boolean[][] visited = new boolean[N][M];

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0, 0, 1});
		visited[0][0] = true;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];
			int cnt = cur[2];

			if (x == N -1 && y == M - 1) {
				return cnt;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
					continue;
				}

				if (visited[nx][ny]) {
					continue;
				}

				if (maps[nx][ny] == 1) {
					visited[nx][ny] = true;
					queue.offer(new int[]{nx, ny, cnt + 1});
				}
			}
		}
		return -1;
    }
}