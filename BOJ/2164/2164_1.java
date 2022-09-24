/**
* 메모리: 28968 KB, 시간: 192 ms
* 2022.09.24
* by Alub
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque q = new ArrayDeque();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while(q.size() != 1){
            q.pop();
            q.add(q.pop());
        }

        System.out.println(q.pop());
    }
}