/**
* 메모리: 17704 KB, 시간: 208 ms
* 2022.08.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        if(N == 1 || N == 0){
            System.out.println(N);
            return;
        }
        else{
            int[] data = new int[N+1];
            data[0] = 0;
            data[1] = 1;
            for(int i=2;i<=N;i++){
                data[i] = data[i-1] + data[i-2];
            }
            System.out.println(data[N]);
        }
    }
}