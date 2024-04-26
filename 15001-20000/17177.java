import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int solve(int a, int b, int c) {
		int p = a;
		int q = 2 * b * c;
		int r = a * (c * c - a * a + b * b);
		int d = q * q - 4 * p * r;
		
		if(d < 0) {
			return -1;
		}
		
		int x = (int) ((-q + Math.sqrt(d)) / (2 * p));
		
		return x < 0 ? -1 : x;
	}
}
