import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        long answer = 1;
        for(int i = n - 1; i > 0; i -= 2) {
        	answer *= i;
        	answer %= 1000000007;
        }
        System.out.print(answer % 1000000007);
    }
}
