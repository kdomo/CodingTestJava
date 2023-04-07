import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author domo
 * Created on 2023/04/07
 */
public class No3_문장_속_단어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String[] str = temp.split(" ");

		int strLength = 0;
		String answer = "";
		for (String s : str) {
			if (strLength < s.length()) {
				strLength = s.length();
				answer = s;
			}
		}
		System.out.println(answer);
	}
}
