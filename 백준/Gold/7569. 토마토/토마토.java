import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int y;
    public static int x;
    public static int z;
    public static int[][][] arr;
    public static int[] xArray = {1, -1, 0, 0, 0, 0};
    public static int[] yArray = {0, 0, 1, -1, 0, 0};
    public static int[] zArray = {0, 0, 0, 0, 1, -1};
    public static int[] cur;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());
        arr = new int[z][y][x];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < x; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        queue.offer(new int[]{k, j, i, 0});
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            int curZ = cur[2];
            int time = cur[3];

            for (int i = 0; i < xArray.length; i++) {
                int newX = curX + xArray[i];
                int newY = curY + yArray[i];
                int newZ = curZ + zArray[i];


                if (newX < 0 || newY < 0 || newZ < 0 ||
                    newX >= x || newY >= y || newZ >= z) {
                    continue;
                }

                if(arr[newZ][newY][newX] == 0) {
                    arr[newZ][newY][newX] = 1;
                    queue.offer(new int[]{newX, newY, newZ, time + 1});
                }
            }
        }

        System.out.println(solution());
    }
    public static int solution() {
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if(arr[i][j][k] == 0) {
                        return -1;
                    }
                }
            }
        }
        return cur[3];
    }
}