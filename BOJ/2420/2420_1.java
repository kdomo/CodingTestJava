/**
* 메모리: 17688 KB, 시간: 208 ms
* 2022.08.06
* by Alub
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();

        System.out.println(Math.abs(N-M));
    }
}