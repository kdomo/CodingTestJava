import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int temp = n;
		do {
			temp = (temp % 10) * 10 + ((temp / 10) + (temp % 10)) % 10;
			cnt++;
		} while (n != temp);
		System.out.println(cnt);
	}
}