/**
* 메모리: 17740 KB, 시간: 212 ms
* 2022.08.20
* by Alub
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int sum = 0;
        for(int i=0; i < c.length; i++){
           sum += c[i] - '0';
        }
        
        
        System.out.print(sum);
    }
}