import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author domo
 * Created on 2023/04/05
 */
public class No1_문자_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char target = br.readLine().charAt(0);
		System.out.println(solution(str, target));
		// input:
		// Computercooler
		// c
		//
		// output:
		// 2
	}

	public static int solution(String str, char target) {
		int answer = 0;
		str = str.toUpperCase();
		target = Character.toUpperCase(target);
		for (char x : str.toCharArray()) {
			if (x == target) answer++;
		}
		return answer;
	}
}
