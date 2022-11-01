import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
        while (num != 0) {
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                break;
            }
            boolean answer = false;

            for (int i = 1; i <= num; i += 2) {
                if (!prime[i] && !prime[num - i]) {
                    System.out.printf("%d = %d + %d\n", num, i, num - i);
                    answer = true;
                    break;
                }
            }
            if (!answer){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}