/**
* 메모리: 14152 KB, 시간: 124 ms
* 2022.10.29
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(N);
        }

        while (N != 0) {
            sb.append(Math.abs(N % -2));
            N = (int) Math.ceil((double) N / -2);
        }

        System.out.println(sb.reverse());
    }
}