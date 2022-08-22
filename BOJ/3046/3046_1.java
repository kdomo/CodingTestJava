/**
* 메모리: 17596 KB, 시간: 216 ms
* 2022.08.22
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int S = sc.nextInt();

        int average = S*2;
        int R2 = average - R1;

        System.out.println(R2);

    }
}