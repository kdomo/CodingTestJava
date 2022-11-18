import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        int turn = 0;
        while (!queue.isEmpty()) {
            int priority = queue.poll();
            if (queue.stream().anyMatch(otherPriority -> priority < otherPriority)) {
                queue.add(priority);
            } else {
                turn++;
                if (location == 0) {
                    break;
                }
            }

            location--;
            if (location < 0) {
                location = queue.size() - 1;
            }
        }
        return turn;
    }
}