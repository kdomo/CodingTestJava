/**
* 메모리: 17704 KB, 시간: 208 ms
* 2022.08.06
* by Alub
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 4 == 0){
            if(a % 100 != 0 || a % 400 == 0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }else {
            System.out.println(0);
        }
    }
}