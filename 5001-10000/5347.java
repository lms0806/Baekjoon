import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());

		long a, b, gcd = 0, answer = 0;
		StringTokenizer st;
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
			gcd = gcd(a,b);
			answer = a * b / gcd;
			
			System.out.println(answer);
		}
	}
	
	public static long gcd(long a, long b) {
		if(a % b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}
}
