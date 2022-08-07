/**
* 메모리: 18668 KB, 시간: 264 ms
* 2022.08.07
* by Alub
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}