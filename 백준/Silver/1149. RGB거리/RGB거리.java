import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][3];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            for (int j = 0; j < split.length; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        int[] tmp = new int[3];
        int[] dp = new int[3];

        for (int i = 0; i < N; i++) {
            tmp = dp.clone();
            for (int j = 0; j < 3; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        min = Math.min(min, tmp[k]);
                    }
                }

                dp[j] = min + map[i][j];
            }
        }

        System.out.println(Arrays.stream(dp).min().getAsInt());
    }
}