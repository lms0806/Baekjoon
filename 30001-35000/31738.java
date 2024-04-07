import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		
		long answer = 0;
		if(n < m) {
			answer = 1;
			for(long i = 2; i <= n; i++) {
				answer = (answer * i) % m;
			}
		}
		System.out.print(answer);
	}
}
