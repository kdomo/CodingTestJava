/**
* 메모리: 18784 KB, 시간: 264 ms
* 2022.08.20
* by Alub
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        long sum = 0;
        long max = 0;
        
        for(int i=0; i < N; i++){
            if(A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        
        System.out.println(sum * 100.0 / max / N);
    }
}