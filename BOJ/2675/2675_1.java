/**
* 메모리: 14216 KB, 시간: 112 ms
* 2022.09.02
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder();
            String line = br.readLine();
            int M = Integer.parseInt(line.split(" ")[0]);
            String str = line.split(" ")[1];

            for(String s : str.split("")){
                for (int j = 0; j < M; j++) {
                    sb.append(s);
                }
            }
            System.out.println(sb.toString());
        }

    }
}