import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		if(a == 0 || a / b != 0) {
			sb.append(a / b).append(" ");
		}
		if(a % b != 0) {
			a %= b;
			
			int gcd = gcd(a, b);
			
			sb.append(a / gcd).append("/").append(b / gcd);
		}
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a % b);
    }
}
