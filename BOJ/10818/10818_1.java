/**
* 메모리: 311072 KB, 시간: 1712 ms
* 2022.09.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            if(t<min){
                min = t;
            }
            if(t > max){
                max = t;
            }
        }

        System.out.println(min + " " + max);

    }
}