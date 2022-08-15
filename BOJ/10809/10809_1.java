/**
* 메모리: 15872 KB, 시간: 144 ms
* 2022.08.15
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentance = br.readLine();
        
        for(int i = (int)'a'; i <= (int)'z'; i++){
            if(sentance.indexOf((char)i) != -1){
                System.out.print(sentance.indexOf((char)i) + " ");
            }else {
                System.out.print(-1 + " ");
            }
        }
    }
}