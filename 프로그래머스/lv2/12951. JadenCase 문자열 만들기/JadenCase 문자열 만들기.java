import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
		StringBuilder sb = new StringBuilder();

		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			if (str.equals(" ")) {
				sb.append(str);
				continue;
			} else if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
				sb.append(String.valueOf(str.charAt(0)).toUpperCase());
			} else {
				sb.append(str.charAt(0));
			}

			sb.append(str.substring(1).toLowerCase());
		}
		return sb.toString();
    }
}