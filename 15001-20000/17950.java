import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		
		int mod = 1000000007;
		long count = 1, answer = 0;
		while(h --> 0) {
			count = (count * x) % mod;
			
			answer = (answer + Integer.parseInt(br.readLine()) * count) % mod;
		}
		System.out.print(answer);
	}
}
