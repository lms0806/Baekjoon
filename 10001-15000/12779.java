import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
		
		long count = 0;
		for(long i = (long) Math.sqrt(a); i * i <= b; i++) {
			count += i * i > a ? 1 : 0;
		}
		
		long g = gcd(b - a, count);
		
		System.out.print(count == 0 ? 0 : (count / g) + "/" + ((b - a) / g));
	}
	
	public static long gcd(long a, long b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
