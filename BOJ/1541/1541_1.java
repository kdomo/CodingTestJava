/**
* 메모리: 14240 KB, 시간: 124 ms
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
        int sum = Integer.MAX_VALUE;
        StringTokenizer minus = new StringTokenizer(br.readLine(), "-");
        while (minus.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");

            while (plus.hasMoreTokens()) {
                temp += Integer.parseInt(plus.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}