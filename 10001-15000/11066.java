import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int size1 = Integer.parseInt(br.readLine());
			
			int[] num = new int[size1 + 1], sum = new int[size1 + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= size1; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				sum[i] = sum[i - 1] + num[i];
			}
			
			int[][] dp = new int[size1 + 1][size1 + 1];
			for(int i = 1; i <= size1; i++) {
				for(int j = 1; j <= size1 - i; j++) {
					dp[j][i + j] = Integer.MAX_VALUE;
					
					for(int k = j; k < i + j; k++) {
						dp[j][i + j] = Math.min(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + sum[i + j] - sum[j - 1]);
					}
				}
			}
			sb.append(dp[1][size1]).append("\n");
		}
		System.out.print(sb);
	}
}
