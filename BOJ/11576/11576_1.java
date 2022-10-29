/**
* 메모리: 14364 KB, 시간: 132 ms
* 2022.10.29
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        for (int i = 1; i <= M; i++) {
            sum += Integer.parseInt(st.nextToken()) * Math.pow(A, M-i);
        }
        if (sum == 0){
            stack.push(0);
        }
        while (sum != 0){
            stack.push(sum % B);
            sum /= B;
        }

        while(!stack.isEmpty()){
            if(stack.size() == 1) {
                sb.append(stack.pop());
            }else{
                sb.append(stack.pop() + " ");
            }
        }
        System.out.println(sb);
    }
}