
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Value{
        Long value;
        int count;

        public Value(Long value, int count) {
            this.value = value;
            this.count = count;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A = Integer.parseInt(str.split(" ")[0]);
        int B = Integer.parseInt(str.split(" ")[1]);
        boolean yn = false;

        Queue<Value> queue = new LinkedList<>();
        queue.offer(new Value(Long.valueOf(A),0));

        while (!queue.isEmpty()){
            Value cur = queue.poll();

            if (cur.value == B) {
                System.out.println(cur.count + 1);
                yn = true;
                break;
            }

            if(cur.value > B) {
                continue;
            }

            queue.offer(new Value(cur.value * 2, cur.count + 1));
            queue.offer(new Value(Long.valueOf(String.valueOf(cur.value) + "1"), cur.count + 1));
        }

        if(!yn){
            System.out.println(-1);
        }
    }
}