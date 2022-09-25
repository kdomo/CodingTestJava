/**
* 메모리: 26656 KB, 시간: 300 ms
* 2022.09.25
* by Alub
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }
        System.out.print("<");
        while(n-- > 0) {
            for (int i = 0; i < k; i++) {
                if(i == k-1) {
                    if(n == 0) System.out.print(queue.poll());
                    else System.out.print(queue.poll() + ", ");
                }else {
                    queue.add(queue.poll());
                }
            }
        }
        System.out.print(">");
    }
}