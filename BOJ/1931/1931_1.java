/**
* 메모리: 71636 KB, 시간: 620 ms
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
        int[][] arr = new int[N][2];
        int count = 0;
        int time = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            arr[i][0] = Integer.parseInt(temp.split(" ")[0]);
            arr[i][1] = Integer.parseInt(temp.split(" ")[1]);
        }

        Arrays.sort(arr, (x, y) ->{ return x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]; });

        for(int i = 0; i < N; i++) {
            if(time <= arr[i][0]) {
                time = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}