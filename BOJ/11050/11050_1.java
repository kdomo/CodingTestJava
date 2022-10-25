/**
* 메모리: 14316 KB, 시간: 124 ms
* 2022.10.25
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 1;
        for (int i = 0; i < K; i++) {
            result *= N--;
        }
        for (int i = K; i > 0; i--) {
            result /= i;
        }
        System.out.println(result);
    }
}