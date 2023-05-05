import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		char[][] board = new char[n + 1][m + 1];
		for(int i = 1; i <= n; i++) {
			String s = br.readLine();
			for(int j = 1; j <= m; j++) {
				board[i][j] = s.charAt(j - 1);
			}
		}
		
		int[][][] dp = new int[n + 1][m + 1][3];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				int num = choice(board[i][j]);
				
				for(int k = 0; k < 3; k++) {
					dp[i][j][k] = dp[i - 1][j][k] + dp[i][j - 1][k] - dp[i - 1][j - 1][k] + (num == k ? 1 : 0);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int sx = Integer.parseInt(st.nextToken()) - 1, sy = Integer.parseInt(st.nextToken()) - 1;
			int ex = Integer.parseInt(st.nextToken()), ey = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < 3; i++) {
				sb.append(dp[ex][ey][i] - dp[ex][sy][i] - dp[sx][ey][i] + dp[sx][sy][i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int choice(char c) {
		return c == 'J' ? 0 : c == 'O' ? 1 : 2;
	}
}
