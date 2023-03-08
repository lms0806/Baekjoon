import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long b = arr[0];
		for(int i = 1; i < n; i++) {
			b = lcm(b, arr[i]);
		}
		
		long a = 0;
		for(int i = 0; i < n; i++) {
			a += b / arr[i];
		}
		
		long abgcd = gcd(a, b);
		
		System.out.print((b / abgcd) + "/" + (a / abgcd));
	}
	
	public static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}
	
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
