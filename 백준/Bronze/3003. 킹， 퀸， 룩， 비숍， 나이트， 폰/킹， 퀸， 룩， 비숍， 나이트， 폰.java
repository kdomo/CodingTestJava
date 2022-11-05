import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int N = Integer.parseInt(st.nextToken());
            System.out.print(chess[i] - N + " ");
        }
        System.out.println();
    }
}