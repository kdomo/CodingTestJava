/**
* 메모리: 17600 KB, 시간: 200 ms
* 2022.08.14
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int gap = 'a' - 'A';
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(65 <= arr[i] && arr[i] <= 90){
                arr[i] = (char) (arr[i] + 32);
                continue;
            }
            if(97 <= arr[i] && arr[i] <= 122){
                arr[i] = (char) (arr[i] - 32);
                continue;
            }
        }

        System.out.println(arr);


    }
}