/**
* 메모리: 17868 KB, 시간: 220 ms
* 2022.10.21
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int answer = 1;

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(answer == a || answer == b) {
                answer = answer == a ? b : a;
            }
        }
        System.out.println(answer);
    }
}