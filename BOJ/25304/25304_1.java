/**
* 메모리: 14172 KB, 시간: 124 ms
* 2022.08.16
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] item = line.split(" ");
            result += Integer.parseInt(item[0]) * Integer.parseInt(item[1]);
        }

        if(result == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}