import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0, r = 1;
		while(n % 2 == 1 && m % 2 == 1) {
			answer += r;
			n /= 2;
			m /= 2;
			r *= 4;
		}
		System.out.print(answer);
	}
}
