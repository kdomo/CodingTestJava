/**
* 메모리: 17876 KB, 시간: 212 ms
* 2022.10.11
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean isPrime = true;
            int temp = sc.nextInt();
            if(temp == 1){
                continue;
            }
            for (int j = 2; j < temp; j++) {
                if (temp % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}