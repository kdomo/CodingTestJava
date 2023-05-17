import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static List<int[]> snake;
	static boolean[][] apple;
	static int N, K, L;

	public static void main(String[] args) throws IOException {
		snake = new LinkedList<>();
		snake.add(new int[]{0, 0});

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		apple = new boolean[N][N];

		K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			String[] str = br.readLine().split(" ");
			apple[Integer.parseInt(str[0]) - 1][Integer.parseInt(str[1]) - 1] = true;
		}

		L = Integer.parseInt(br.readLine());
		int[][] dir = new int[L][2];
		for (int i = 0; i < L; i++) {
			String[] str = br.readLine().split(" ");
			dir[i][0] = Integer.parseInt(str[0]);
			dir[i][1] = str[1].equals("L") ? -1 : 1;
		}

		System.out.println(solution(0, 0, 0, dir));
	}

	private static int solution(int curX, int curY, int currentDir, int[][] dir) {
		int time = 0;
		int turn = 0;

		while (true) {
			time++;
			int nextX = curX + dx[currentDir];
			int nextY = curY + dy[currentDir];

			if (isEnd(nextX, nextY)) break;

			if (apple[nextX][nextY]) {
				apple[nextX][nextY] = false;
			} else {
				snake.remove(0);
			}
			snake.add(new int[]{nextX, nextY});

			curX = nextX;
			curY = nextY;

			if (turn < L) {
				if (time == dir[turn][0]) {
					currentDir = nextDir(currentDir, dir[turn][1]);
					turn++;
				}
			}
		}
		return time;
	}

	private static int nextDir(int current, int dir) {
		int nextDir = (current + dir) % 4;
		if (nextDir == -1) nextDir = 3;
		return nextDir;
	}

	private static boolean isEnd(int x, int y) {
		if (x == -1 || x == N || y == -1 || y == N) {
			return true;
		}

		for (int i = 0; i < snake.size(); i++) {
			int[] s = snake.get(i);
			if (s[0] == x && s[1] == y) return true;
		}

		return false;
	}
}
