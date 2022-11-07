import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static int[][] arr;
    public static boolean[][] visited;
    public static int[] xArray = {1, -1, 0, 0};
    public static int[] yArray = {0, 0, 1, -1};
    public static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();


        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{j, i, 0});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if (x < 0 || x >= M || y < 0 || y >= N) {
                continue;
            }
            if (visited[y][x]) {
                continue;
            }
            count = cur[2];
            visited[y][x] = true;
            arr[y][x] = 1;

            for (int i = 0; i < xArray.length; i++) {
                int newX = x + xArray[i];
                int newY = y + yArray[i];

                if (newX < 0 || newX >= M || newY < 0 || newY >= N) {
                    continue;
                }

                if (!visited[newY][newX] && arr[newY][newX] == 0) {
                    queue.offer(new int[]{newX, newY, count + 1});
                }
            }
        }


        boolean answer = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    answer = false;
                    System.out.println(-1);
                    break;
                }
            }
            if(!answer) {
                break;
            }
        }
        if (answer) {
            System.out.println(count);
        }
    }
}