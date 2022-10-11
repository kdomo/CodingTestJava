/**
* 메모리: 17816 KB, 시간: 212 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int index = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
            if (count == K) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}