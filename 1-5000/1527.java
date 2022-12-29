import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long a, b, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		
		solve(4);
		solve(7);
		
		System.out.print(answer);
	}
	
	public static void solve(long n) {
		if(n > b) {
			return;
		}
		if(n >= a) {
			answer++;
		}
		
		solve(10 * n + 4);
		solve(10 * n + 7);
		
	}
}
