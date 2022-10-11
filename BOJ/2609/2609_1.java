/**
* 메모리: 17704 KB, 시간: 204 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
    }

    public static int GCD(int a, int b){
        if(a % b == 0) {
            return b;
        }
        return GCD(b, a%b);
    }

    public static int LCM(int a, int b){
        return a * b / GCD(a, b);
    }
}