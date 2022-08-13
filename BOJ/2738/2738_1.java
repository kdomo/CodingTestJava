/**
* 메모리: 37172 KB, 시간: 584 ms
* 2022.08.13
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] temp1 = new int[N][M];
        int[][] temp2 = new int[N][M];
        int[][] temp3 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int temp = sc.nextInt();
                temp1[i][j] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int temp = sc.nextInt();
                temp2[i][j] = temp;
            }
        }



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println((temp1[i][j] + temp2[i][j]));
            }
        }
    }
}