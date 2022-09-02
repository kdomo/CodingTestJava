/**
* 메모리: 17688 KB, 시간: 208 ms
* 2022.09.02
* by Alub
*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrA = {1,2,3,4,5,6,7,8};
        int[] arrB = {8,7,6,5,4,3,2,1};
        int[] arrN = new int[8];

        for (int i = 0; i < 8; i++) {
            arrN[i] = sc.nextInt();
        }

        if(Arrays.equals(arrN, arrA)){
            System.out.println("ascending");
        } else if (Arrays.equals(arrN, arrB)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}