import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length() / 10;
		for (int i = 0,j = 0; j < n; i+=10, j++) {
			System.out.println(str.substring(i, i+10));
		}
		int k = str.length() % 10;
		System.out.println(str.substring(n*10, n*10 + k));
	}
}