/**
* 메모리: 17816 KB, 시간: 220 ms
* 2022.08.09
* by Alub
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for(int i=0; i<n; i++){
            arrs[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        
        for(int arr : arrs){
            if(arr == A){
                count++;
            }
        }
        System.out.println(count);
    }
}