import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int c = Integer.parseInt(br.readLine());

		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] grades = new int[n];
			for (int j = 0; j < n; j++) {
				grades[j] = Integer.parseInt(st.nextToken());
			}
			double average = Arrays.stream(grades).average().getAsDouble();
			double count = Arrays.stream(grades).filter(grade -> grade > average).count();
			System.out.printf("%.3f%%\n", count / n * 100);
		}
	}
}