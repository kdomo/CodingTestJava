/**
* 메모리: 85172 KB, 시간: 420 ms
* 2022.10.19
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.split(" ")[i]);
        }
        Arrays.sort(arr);
        int result = 0;
        int prev = 0;

        for (int i = 0; i < arr.length; i++) {
            result += prev + arr[i];
            prev += arr[i];
        }
        System.out.println(result);
    }
}