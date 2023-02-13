import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		if (a != b && b != c && c != a) { // 셋 모두 다를 경우
			int max = Math.max(a, Math.max(b, c));
			answer = max * 100;
		} else if (a == b && b == c && c == a) { // 셋 모두 같을 경우
			answer = 10000 + (a * 1000);
		} else if (a == b || a == c) { // a가 b 또는 c랑만 같을 경우
			answer = 1000 + (a * 100);
		} else {
			answer = 1000 + (b * 100); // b 랑 c만 같은경우
		}
		System.out.println(answer);
	}
}