/**
* 메모리: 14192 KB, 시간: 120 ms
* 2022.09.11
* by Alub
*/
import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int x_min = Math.min(x, w-x);
		int y_min = Math.min(y, h-y);
		int min = Math.min(x_min, y_min);
		System.out.println(min);	
	}
}

