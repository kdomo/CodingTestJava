/**
* 메모리: 14264 KB, 시간: 124 ms
* 2022.10.24
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = 0;
        int three = 0;
        while (true) {
            if (N % 5 == 0){
                five = N/5;
                System.out.println(five + three);
                break;
            }
            if(N < 0){
                System.out.println(-1);
                break;
            }
            N = N - 3;
            three++;
        }
    }
}