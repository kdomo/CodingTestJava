/**
* 메모리: 17600 KB, 시간: 212 ms
* 2022.08.14
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] count = new int[10];

        String sum = Integer.toString(A * B * C) ;
        char[] item = sum.toCharArray();

        for(char i : item){
            count[i - '0']++;
        }

        for (int i : count){
            System.out.println(i);
        }
    }
}