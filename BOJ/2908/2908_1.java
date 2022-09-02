/**
* 메모리: 17664 KB, 시간: 204 ms
* 2022.09.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        String A = String.valueOf(sc.nextInt());
        String B = String.valueOf(sc.nextInt());

        sb = new StringBuilder(A);
        sb.reverse();
        int a = Integer.parseInt(sb.toString());

        sb = new StringBuilder(B);
        sb.reverse();
        int b = Integer.parseInt(sb.toString());

        System.out.println(Math.max(a,b));

    }
}