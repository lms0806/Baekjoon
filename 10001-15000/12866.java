import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		long mod = 1000000007;
		long a = 0, c = 0, g = 0, t = 0;
		for(char ch : br.readLine().toCharArray()) {
			switch(ch) {
				case 'A':
					a++;
					break;
				case 'C':
					c++;
					break;
				case 'G':
					g++;
					break;
				default:
					t++;
			}
		}
		
		long answer = a;
		
		answer *= c;
		answer %= mod;
		
		answer *= g;
		answer %= mod;
		
		answer *= t;
		answer %= mod;
		
		System.out.print(answer);
	}
}
