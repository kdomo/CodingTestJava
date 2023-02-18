import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int X = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		int lt = 0;
		int rt = N-1;
		while (lt < rt) {
			int tmp = arr[lt] + arr[rt];

			if (tmp == X) {
				cnt++;
			}

			if (tmp <= X) {
				lt++;
			} else if (tmp > X) {
				rt--;
			}
		}

		System.out.println(cnt);
	}
}