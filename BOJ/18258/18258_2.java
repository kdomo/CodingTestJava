/**
* 메모리: 356916 KB, 시간: 1628 ms
* 2022.09.24
* by Alub
*/
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque q = new ArrayDeque();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            String cmd = temp.split(" ")[0];
            switch (cmd) {
                case "push" :
                    int data = Integer.parseInt(temp.split(" ")[1]);
                    q.add(data);
                    break;
                case "pop" :
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.pop() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(q.size() + "\n");
                    break;
                case "empty" :
                    if (q.size() == 0) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front" :
                    if (q.size() == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.getFirst() + "\n");
                    }
                    break;
                case "back" :
                    if (q.size() == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.getLast() + "\n");
                    }
                    break;

            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}