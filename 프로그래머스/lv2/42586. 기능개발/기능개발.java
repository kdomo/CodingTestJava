import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         int[] temp = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            temp[day]++;
        }

        return Arrays.stream(temp).filter(i -> i != 0).toArray();
    }
}