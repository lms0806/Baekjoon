import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		while(n --> -1) {
			st = new StringTokenizer(br.readLine());
			
			sum = (sum * x + Integer.parseInt(st.nextToken())) % mod;
		}
		System.out.print(sum);
	}
}
