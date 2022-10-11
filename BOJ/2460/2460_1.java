/**
* 메모리: 17620 KB, 시간: 204 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            count -= out;
            count += in;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}