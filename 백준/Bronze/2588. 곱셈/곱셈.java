import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        for (int i = B.length()-1; i >= 0; i--) {
            System.out.println(A * Integer.parseInt(String.valueOf(B.toCharArray()[i])));
        }
        System.out.println(A * Integer.parseInt(B));
    }
}