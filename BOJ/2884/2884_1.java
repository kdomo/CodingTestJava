/**
* 메모리: 18588 KB, 시간: 240 ms
* 2022.09.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int minus = 45;

        int t = M - minus;

        if(t < 0){
            H = H - 1;
            M = 60 + M - minus;
        }else{
            M = M - minus;
        }

        if(H < 0){
            H += 24;
        }
        System.out.println(H + " " + M);
    }
}
