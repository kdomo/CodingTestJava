import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '<') {
                    if(!stack.isEmpty()) {
                        stack2.push(stack.pop());
                    }
                } else if(str.charAt(j) == '>') {
                    if(!stack2.isEmpty()) {
                        stack.push(stack2.pop());
                    }
                } else if(str.charAt(j) == '-') {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(str.charAt(j));
                }
            }
            while(!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            System.out.println(sb.reverse().toString());
        }
    }
}