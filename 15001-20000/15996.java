import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken());
		
		long num = a;
		int answer = 0;
		while(num <= n) {
			answer += n / num;
			num *= a;
		}
		System.out.print(answer);
	}
}
