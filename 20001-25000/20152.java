import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		long[][] dp = new long[31][31];

		Arrays.fill(dp[0], 1);

		for(int i = 1; i < 31; i++){
			for(int j = i; j < 31; j++){
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		int num = Math.abs(h - n);
        
		System.out.print(dp[num][num]);
	}
}
