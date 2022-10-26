/**
* 메모리: 432796 KB, 시간: 2260 ms
* 2022.10.26
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        countingSort(nums);

        for (int i = 0; i < N; i++) {
            sb.append(nums[i] + "\n");
        }
        System.out.println(sb);
    }

    private static void countingSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int idx = 0;
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int cnt = map.get(list.get(i));
            while(cnt > 0) {
                nums[idx++] = list.get(i);
                cnt--;
            }
        }
    }
}