import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(change(st.nextToken()), change(st.nextToken()), change(st.nextToken()), change(st.nextToken())));
	}
	
	public static int solve(int a, int b, int c, int n) {
		for(int i = 0; i <= n / a; i++) {
			for(int j = 0; j <= n / b; j++) {
				for(int k = 0; k <= n / c; k++) {
					if(a * i + b * j + c * k == n) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
	
	public static int change(String s) {
		return Integer.parseInt(s);
	}
}
