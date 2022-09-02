/**
* 메모리: 17668 KB, 시간: 200 ms
* 2022.09.02
* by Alub
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            set.add(temp % 42);
        }
        System.out.println(set.size());
    }
}