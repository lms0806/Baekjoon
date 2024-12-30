import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[n + 1];
			dp = new int[n + 1][n + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			sb.append(solve(1, n, 0)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(int l, int r, int count) {
		if(l > r) {
			return 0;
		}
		
		if(dp[l][r] != 0) {
			return dp[l][r];
		}
		
		if(count % 2 == 0) {
			return dp[l][r] = Math.max(arr[l] + solve(l + 1, r, count + 1), arr[r] + solve(l, r - 1, count + 1));
		}
		else {
			return dp[l][r] = Math.min(solve(l + 1, r, count + 1), solve(l, r - 1, count + 1));
		}
	}
}
