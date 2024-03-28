import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            char[][] board = new char[n][m];
            int[][] dp = new int[n][m];

            for(int i = 0; i < n; i++){
                board[i] = br.readLine().toCharArray();
                for(int j = 0; j < m; j++){
                    if(board[i][j] == 'C'){
                        dp[i][j] = 1;
                    }
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(i > 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (board[i][j] == 'C' ? 1 : 0));
                    }
                    if(j > 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (board[i][j] == 'C' ? 1 : 0));
                    }
                    if(i > 0 && j > 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + (board[i][j] == 'C' ? 1 : 0));
                    }
                }
            }

            sb.append(dp[n - 1][m - 1]).append("\n");
        }
        System.out.print(sb);
    }
}
