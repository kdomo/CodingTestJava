/**
* 메모리: 18304 KB, 시간: 232 ms
* 2022.10.20
* by Alub
*/
import java.util.Scanner;

class Main {
    private static int n;
    private static int r;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        arr = new int[r];
        combination(0, 1);
    }
    private static void combination(int cnt, int start) {
        if (cnt == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i + 1);
        }
    }
}