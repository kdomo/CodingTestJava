import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[] xArray = {1, -1, 0, 0};
    public static int[] yArray = {0, 0, 1, -1};
    public static int[][] arr;
    public static int[][] deleted;
    public static int count;
    public static int N;
    public static int M;
    public static int time;
    public static int prev;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        deleted = new int[N][M];
        count = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1) {
                    count ++;
                }
            }
        }

        bfs();
        System.out.println(time);
        System.out.println(prev);
    }

    public static void bfs() {
        if(count == 0) {
            return;
        }
        prev = count;
        time++;
        int[][] visited = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> deleteQueue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            if(visited[y][x] == 1){
                continue;
            }

            visited[y][x] = 1;

            if (arr[y][x] == 1) {
                deleteQueue.offer(new int[]{x, y});
                count--;
                continue;
            }


            for (int i = 0; i < xArray.length; i++) {
                int newX = x + xArray[i];
                int newY = y + yArray[i];

                if (newX < 0 || newX >= arr[0].length || newY < 0 || newY >= arr.length) {
                    continue;
                }

                if (visited[newY][newX] == 1) {
                    continue;
                }

                if (deleted[newY][newX] == 1) {
                    continue;
                }

                queue.offer(new int[]{newX, newY});
            }

        }
        while(!deleteQueue.isEmpty()){
            int[] cur = deleteQueue.poll();
            int x = cur[0];
            int y = cur[1];
            arr[y][x] = 0;
        }
        bfs();
    }
}