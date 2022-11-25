import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
       String answer = "";

        String[] temp = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });

        for (int i = temp.length - 1; i >= 0; i--) {
            answer += temp[i];
        }

        if (answer.charAt(0) == '0') return "0";

        return answer;
    }
}