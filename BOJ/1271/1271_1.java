/**
* 메모리: 17912 KB, 시간: 236 ms
* 2022.08.21
* by Alub
*/
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        BigInteger M = sc.nextBigInteger();


        System.out.println(N.divide(M));
        System.out.println(N.remainder(M));
    }
}