/**
* 메모리: 17740 KB, 시간: 216 ms
* 2022.09.03
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = String.valueOf(sc.nextInt());

            if("0".equals(str)){
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(str));
            sb.reverse();

            if(str.equals(sb.toString())){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }
}