/**
* 메모리: 23288 KB, 시간: 392 ms
* 2022.08.22
* by Alub
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++){
			for(int j=0;j<N-i;j++){
                System.out.print(" ");
            }
			for(int j=1;j<=i;j++){
			    System.out.print("*");
			}
		System.out.println();
		}		
	}
}