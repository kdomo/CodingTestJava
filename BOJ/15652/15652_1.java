/**
* 메모리: 19872 KB, 시간: 216 ms
* 2022.10.21
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int r;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        r = Integer.parseInt(str.split(" ")[1]);
        arr = new int[r];

        repeatedCombination(0, 1);
        System.out.println(sb);

    }

    public static void repeatedCombination(int depth, int start){
        if (depth == r){
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            repeatedCombination(depth + 1 , i);
        }
    }
}