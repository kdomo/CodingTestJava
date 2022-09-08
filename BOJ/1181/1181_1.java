/**
* 메모리: 40760 KB, 시간: 884 ms
* 2022.09.08
* by Alub
*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		String temp = "";
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparing(String::length));
		for(int i = 0; i<arr.length; i++) {
			if(temp.equals(arr[i])) {
				continue;
			}
			else {
				System.out.println(arr[i]);
				temp = arr[i];
			}
		}
	}
}