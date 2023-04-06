import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author domo
 * Created on 2023/04/06
 */
public class No2_대소문자_변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = br.readLine().charAt(0);
		System.out.println(solution(str, c));
		// input
		// StuDY
		//
		// output
		// sTUdy
	}

	public static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);

		for (String s : str.split("")) {
			if (s.charAt(0) == c) {
				answer++;
			}
		}

		return answer;
	}
}
