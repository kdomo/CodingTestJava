/**
* 메모리: 17696 KB, 시간: 204 ms
* 2022.08.06
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result =1;
        for (int i = N; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}