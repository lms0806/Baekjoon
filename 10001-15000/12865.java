import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][2];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[k + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = k; j >= arr[i][0]; j--) {
				dp[j] = Math.max(dp[j], dp[j - arr[i][0]] + arr[i][1]);
			}
		}
		
		System.out.print(dp[k]);
	}
}
