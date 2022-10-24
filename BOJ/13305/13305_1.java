/**
* 메모리: 35936 KB, 시간: 408 ms
* 2022.10.22
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dist = new long[N - 1];
        long[] cost = new long[N];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N-1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];
        for (int i = 0; i < N-1; i++) {
            if(cost[i] < minCost){
                minCost = cost[i];
            }

            sum += (minCost * dist[i]);
        }
        System.out.println(sum);
    }
}