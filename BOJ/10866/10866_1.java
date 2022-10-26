/**
* 메모리: 20692 KB, 시간: 244 ms
* 2022.10.26
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            String cmd = temp.split(" ")[0];
            int item;
            switch (cmd) {
                case "push_front":
                    item = Integer.parseInt(temp.split(" ")[1]);
                    deque.addFirst(item);
                    break;
                case "push_back":
                    item = Integer.parseInt(temp.split(" ")[1]);
                    deque.addLast(item);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(deque.pollFirst() + "\n");
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(deque.pollLast() + "\n");
                    break;
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(deque.peekFirst() + "\n");
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(deque.peekLast() + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
