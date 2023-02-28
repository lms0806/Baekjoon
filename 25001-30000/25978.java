import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		long[][] arr = new long[n + 3][n + 3], dp = new long[n + 3][n + 3];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			int sx = Integer.parseInt(st.nextToken()) + 1, sy = Integer.parseInt(st.nextToken()) + 1;
			int ex = Integer.parseInt(st.nextToken()) + 2, ey = Integer.parseInt(st.nextToken()) + 2; 
			
			if(choice == 1) {
				int k = Integer.parseInt(st.nextToken());
				
				dp[sx][sy] += k;
				dp[sx][ey] -= k;
				dp[ex][sy] -= k;
				dp[ex][ey] += k;
				
				flag = true;
			}
			else {
				if(flag) {
					for(int i = 0; i < n; i++) {
						for(int j = 0; j < n; j++) {
							dp[i + 1][j + 1] += dp[i + 1][j] + dp[i][j + 1] - dp[i][j];
							arr[i + 1][j + 1] += arr[i + 1][j] + arr[i][j + 1] - arr[i][j] + dp[i + 1][j + 1];
						}
					}
					
					for(int i = 0; i < n; i++) {
						Arrays.fill(dp[i], 0);
					}
				}
				
				sx--;
				sy--;
				ex--;
				ey--;
				
				sb.append(arr[ex][ey] - arr[sx][ey] - arr[ex][sy] + arr[sx][sy]).append("\n");
				
				flag = false;
			}
		}
		System.out.print(sb);
	}
}
