import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long a = Long.parseLong(br.readLine()), x = Long.parseLong(br.readLine());
        
        long answer = 1;
        long mod = 1000000007;
        while(x > 0) {
        	if(x % 2 == 1) {
        		answer *= a;
        		answer %= mod;
        	}
        	a = ((a % mod) * (a % mod)) % mod;
        	x /= 2;
        }
        System.out.print(answer);
    }
}
