import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int[][] board = new int[m][n];
		
		int[][] dp = new int[m + 1][n + 1];
        
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(board[i-1][j-1] == 0){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }
        System.out.print(answer);
	}
}
