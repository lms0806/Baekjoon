import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int max = Math.min(a + b, 2 * n - (a + b));
		
		int answer = 0, mul = 1;
		for(int i = 0; i < n; i++) {
			if(i >= n - max) {
				answer += mul;
			}
			mul <<= 1;
		}
		System.out.print(answer);
	}
}
