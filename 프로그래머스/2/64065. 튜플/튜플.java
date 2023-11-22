import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length());
        s = s.substring(0, s.length() -2);
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        
        Arrays.sort(str, (s1, s2) -> s1.length() - s2.length());
        
        for(String x : str) {
            String[] tmp = x.split(",");
            
            for (int i = 0; i < tmp.length; i++) {
                int n = Integer.parseInt(tmp[i]);
                
                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }
        }
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}