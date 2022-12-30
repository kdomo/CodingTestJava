import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int Y, X;
	public static int[][] arr;
	public static int[][][] visited;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Y = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		arr = new int[Y][X];
		visited = new int[Y][X][2];

		for (int i = 0; i < Y; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < X; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}

		dfs();
	}

	private static void dfs() {
		Queue<int[]> queue = new LinkedList<>();
		visited[0][0][0] = 1;
		queue.offer(new int[]{0, 0, 1, 0});

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];
			int cnt = cur[2];
			int wall = cur[3];

			if (x == X -1 && y == Y -1) {
				System.out.println(cnt);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= X || ny < 0 || ny >= Y ) {
					continue;
				}

				if (visited[ny][nx][wall] != 0) {
					continue;
				}

				if (arr[ny][nx] == 0) {
					visited[ny][nx][wall] = visited[y][x][wall] + 1;
					queue.offer(new int[]{nx, ny, cnt + 1, wall});
				}

				if (arr[ny][nx] == 1 && wall == 0) {
					visited[ny][nx][wall] = visited[y][x][wall] + 1;
					queue.offer(new int[]{nx, ny, cnt + 1, 1});
				}

			}
		}
		System.out.println(-1);
	}
}