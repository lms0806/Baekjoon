import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		System.out.print(solve(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
	}
	
	public static int solve(long a, long b) {
		int answer = 1;
		while(b != a) {
			if(b < a) {
				return -1;
			}
			
			if(b % 10 != 1 && b % 2 != 0) {
				return -1;
			}
			
			b /= b % 2== 0 ? 2 : 10;
			
			answer++;
		}
		return answer;
	}
}
