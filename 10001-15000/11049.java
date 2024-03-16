import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[][] num = new int[size + 1][size + 1];
		
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[size + 1][size + 1];
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size - i; j++) {
				dp[j][i + j] = Integer.MAX_VALUE;
				
				for(int k = j; k < i + j; k++) {
					dp[j][i + j] = Math.min(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + num[j][0] * num[k][1] * num[i + j][1]);
				}
			}
		}
		System.out.print(dp[1][size]);
	}
}
