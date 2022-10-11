/**
* 메모리: 31752 KB, 시간: 244 ms
* 2022.10.11
* by Alub
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 1;

        for (int i = 0; i < B; i++) {
            for (int j = 0; j < count; j++) {
                list.add(count);
            }
            count++;
        }

        for (int i = A-1; i < B; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}