/**
* 메모리: 18740 KB, 시간: 264 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int min = N;
        int sum = 0;

        for(int i = M; i <= N; i++) {
            boolean isPrime = true;
            
            if(i == 1) isPrime = false;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                min = Math.min(min, i);
                sum += i;
            }
        }
        
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum + "\n" + min);
        }
    }
}