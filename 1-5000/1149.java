import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] num, dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		num = new int[n][3];
		dp = new int[n][3];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[0] = new int[] { num[0][0], num[0][1], num[0][2] };

		for (int i = 1; i < n; i++) {
			dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + num[i][0];
			dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + num[i][1];
			dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + num[i][2];
		}

		System.out.print(min(dp[n - 1][0], min(dp[n - 1][1], dp[n - 1][2])));
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}
