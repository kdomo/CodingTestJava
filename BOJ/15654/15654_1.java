/**
* 메모리: 40992 KB, 시간: 440 ms
* 2022.10.21
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int n;
    public static int r;
    public static int[] arr;
    public static int[] nums;
    private static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        r = Integer.parseInt(str.split(" ")[1]);
        nums = new int[n];
        arr = new int[r];
        visited = new boolean[n];

        str = br.readLine();
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(str.split(" ")[i]);
        }
        Arrays.sort(nums);
        permutation(0);

        System.out.println(sb);

    }

    private static void permutation(int depth) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = nums[i];
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}