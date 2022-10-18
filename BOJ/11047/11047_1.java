/**
* 메모리: 14176 KB, 시간: 120 ms
* 2022.10.18
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = arr.length-1; i >= 0 ; i--) {
            if (K >= arr[i]){
                count += K / arr[i];
                K = K % arr[i];
            }
            if (K == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}