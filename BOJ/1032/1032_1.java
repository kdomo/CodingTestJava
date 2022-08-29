/**
* 메모리: 14828 KB, 시간: 144 ms
* 2022.08.29
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split("");

        for (int i = 0; i < n - 1; i++) {
            String[] b = br.readLine().split("");
            for (int j = 0; j < a.length; j++) {
                if (!a[j].equals(b[j])) a[j] = "?";
            }
        }

        for (String s : a){
            System.out.print(s);
        }
        System.out.println();
    }

}