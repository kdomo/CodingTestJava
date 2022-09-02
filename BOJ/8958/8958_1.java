/**
* 메모리: 15028 KB, 시간: 152 ms
* 2022.09.02
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum;
        int index;

        for (int i = 0; i < N; i++) {
            sum = 0;
            index = 0;
            String str = br.readLine();

            for(String s : str.split("")){
                if("O".equals(s)){
                    index++;
                }else{
                    index = 0;
                }

                sum += index;
            }
            System.out.println(sum);
        }
    }
}