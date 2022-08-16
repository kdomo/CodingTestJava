/**
* 메모리: 14228 KB, 시간: 128 ms
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
        System.out.println(f(number));
    }
    static int f(String[] str){

        int result = 0;
        for (String item : str){
            result += (Integer.parseInt(item) * Integer.parseInt(item));
        }
        result %= 10;
        return result;
    }
}