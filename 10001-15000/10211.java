import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] dp = new int[n + 1];
			
			int answer = Integer.MIN_VALUE;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				dp[i] = Math.max(num, dp[i - 1] + num);
				
				answer = Math.max(answer, dp[i]);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
