/**
* 메모리: 14180 KB, 시간: 128 ms
* 2022.08.16
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] number = str.split(" ");
        System.out.println(f(Long.valueOf(number[0]), Long.valueOf(number[1])));
    }
    static long f(long a,long b){
        long result = (a+b)*(a-b);
        return result;
    }
}