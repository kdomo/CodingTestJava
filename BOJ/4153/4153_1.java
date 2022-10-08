/**
* 메모리: 17580 KB, 시간: 208 ms
* 풀이 시간: 00:00:02
* 2022.10.08
* by Alub
*/
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        while(true) {
        	int x = in.nextInt();
        	int y = in.nextInt();
        	int z = in.nextInt();
        	
        	if(x == 0 && y == 0 && z == 0) break;
            
        	if((x * x + y * y) == z * z) {
				System.out.println("right");
			}
        	else if(x * x == (y * y + z * z)) {
				System.out.println("right");
			}
        	else if(y * y == (z * z + x * x)) {
				System.out.println("right");
			}
        	else {
				System.out.println("wrong");
			}
		}
	}
}