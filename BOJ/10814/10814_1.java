/**
* 메모리: 92184 KB, 시간: 2052 ms
* 2022.10.25
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][3];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            members[i][0] = temp.split(" ")[0];
            members[i][1] = temp.split(" ")[1];
            members[i][2] = String.valueOf(i);
        }

        Arrays.sort(members,(x,y) -> {
            return Integer.parseInt(x[0]) == Integer.parseInt(y[0]) ?
                    Integer.parseInt(x[2]) - Integer.parseInt(y[2]) :
                    Integer.parseInt(x[0]) - Integer.parseInt(y[0]);
        });

        for (String[] a : members){
            System.out.println(a[0] + " " + a[1]);
        }
    }
}