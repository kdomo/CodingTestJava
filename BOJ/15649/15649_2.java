/**
* 메모리: 72956 KB, 시간: 2152 ms
* 2022.10.20
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static int n;
    private static int r;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        r = Integer.parseInt(str.split(" ")[1]);
        arr = new int[r];
        visited = new boolean[n + 1];
        permutation(0);
    }

    public static void permutation(int depth) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}