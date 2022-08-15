/**
* 메모리: 15980 KB, 시간: 148 ms
* 2022.08.15
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            String out1 = String.valueOf(temp.toCharArray()[0]);
            String out2 = String.valueOf(temp.toCharArray()[temp.length()-1]);
            sb.append(out1 + out2 + "\n");
        }

        System.out.println(sb);
    }
}