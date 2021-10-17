import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[2], b = new int[2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = b[0] * b[1]/ gcd(b[0],b[1]);
		int num = max / b[0] * a[0] + max / b[1] * a[1];
		
		int gcd = gcd(num, max);
		
		System.out.print(num/gcd + " " + max/gcd);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
