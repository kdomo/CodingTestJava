import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			Set<String> set = new HashSet<>();
			String[] str = br.readLine().split("");
			String prev = "";
			boolean flag = true;
			for (String s : str) {
				if (prev.equals(s)) continue;
				if (set.contains(s)) {
					flag = false;
					break;
				}
				set.add(s);
				prev = s;
			}
			if (flag) cnt++;
		}
		System.out.println(cnt);
	}
}