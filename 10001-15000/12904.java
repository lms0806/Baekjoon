import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(br.readLine(), br.readLine()));
	}
	
	public static int solve(String a, String b) {
		while(true) {
			if(a.length() == b.length()) {
				if(a.equals(b)) {
					return 1;
				}
				return 0;
			}
			
			char c = b.charAt(b.length() - 1);
			
			b = b.substring(0, b.length() - 1);
			
			if(c == 'B') {
				b = new StringBuilder(b).reverse().toString();
			}
		}
	}
}
