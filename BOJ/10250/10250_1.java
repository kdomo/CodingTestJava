/**
* 메모리: 16372 KB, 시간: 228 ms
* 2022.10.26
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] room = new int[99*99];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j <= W; j++) {
                for (int k = 1; k <= H; k++) {
                    room[count++] = ((k*100) + j);
                }
            }
            System.out.println(room[N-1]);
        }
    }
}