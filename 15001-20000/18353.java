import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n], dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(num[i] < num[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.print(n - answer - 1);
	}
}
