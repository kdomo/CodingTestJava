import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[5001];
        dp[0] = dp[2] = 1;
        for (int i = 2; i <= 2500; i++) {
            for (int j = 0; j < i; j++) {
                dp[i*2] += dp[j*2]*dp[(i-j-1)*2];
                dp[i*2] %= 1_000_000_007L;
            }
        }

        for (int i = 0; i < T; i++) {
            int L = Integer.parseInt(br.readLine());
            sb.append(dp[L]).append("\n");
        }
        System.out.println(sb);
    }
}