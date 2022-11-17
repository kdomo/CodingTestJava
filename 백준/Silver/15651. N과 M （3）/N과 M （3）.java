import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static int n;
    private static int r;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        r = Integer.parseInt(str.split(" ")[1]);
        arr = new int[r];
        permutation(0);
        System.out.println(sb);
    }

    public static void permutation(int depth) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            permutation(depth + 1);
        }
    }
}