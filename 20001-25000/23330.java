import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long[] num = new long[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		long[] dp = new long[n];
		dp[0] = num[0];
		
		for(int i = 1; i < n; i++) {
			dp[i] = dp[i - 1] + num[i];
		}
		
		long answer = 0;
		for(int i = 0; i < n - 1; i++) {
			answer += dp[n - 1] - dp[i] - num[i] * (n - i - 1);
		}
		System.out.print(answer * 2);
	}
}
