import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long[] arr = new long[N];

        st = new StringTokenizer(br.readLine());
        long max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        long left = 0;
        long right = max;
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.max(arr[i] - mid, 0);
            }

            if (sum >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}