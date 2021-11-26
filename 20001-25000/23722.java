import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
			if(a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			
			sb.append(gcd(gcd(a, b), gcd(c, d))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
