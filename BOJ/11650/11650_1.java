/**
* 메모리: 71508 KB, 시간: 2376 ms
* 2022.10.25
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coorids = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            coorids[i][0] = Integer.parseInt(st.nextToken());
            coorids[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coorids, (x, y) -> {return x[0] == y[0] ? x[1] - y[1] : x[0] - y[0];});

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(coorids[i][j] + " ");
            }
            System.out.println();
        }
    }
}