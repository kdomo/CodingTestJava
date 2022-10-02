/**
* 메모리: 89508 KB, 시간: 392 ms
* 2022.10.02
* by Alub
*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666;
        int count = 1;
        
        while (count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}