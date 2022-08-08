/**
* 메모리: 17948 KB, 시간: 236 ms
* 2022.08.08
* by Alub
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}