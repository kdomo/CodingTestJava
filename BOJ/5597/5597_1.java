/**
* 메모리: 17636 KB, 시간: 212 ms
* 2022.08.11
* by Alub
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=28; i++){
            int temp = sc.nextInt();
            list.add(temp);
        }


        for(int i=1; i<=30; i++){
            if(!list.contains(Integer.valueOf(i))){
                System.out.println(i);
            }
        }
    }
}