/**
* 메모리: 18320 KB, 시간: 236 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char[] binary = Integer.toBinaryString(sc.nextInt()).toCharArray();

            for (int j = binary.length - 1; j >= 0; j--) {
                if(binary[j] == '1'){
                    System.out.print(binary.length - j - 1 + " ");
                }
            }
        }
    }
}