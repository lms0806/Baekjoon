import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		System.out.print(answer);
	}
	
	public static void solve(int a, int b) {
		answer++;
		
		if(a == b) {
			return;
		}
		
		if(a > b) {
			solve(a - b, b);
		}
		else {
			solve(a, b - a);
		}
	}
}
