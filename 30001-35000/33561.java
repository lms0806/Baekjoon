import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[][] num = new int[n + 1][n + 1], dp = new int[n + 1][n + 1], check = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				dp[i][j] = num[i][j] = st.nextToken().charAt(0) - '0';
				
				check[i][j] = num[i][j] == 0 ? 1 : 0;
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		int[] arr = new int[k];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				dp[i][j] += dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
				check[i][j] += check[i - 1][j] + check[i][j - 1] - check[i - 1][j - 1];
			}
		}
		
		long[] arr2 = new long[k + 1];
        for (int i = k - 1, j = 1; i >= 0; i--, j++) {
            arr2[j] = arr2[j - 1] + arr[i];
        }
		
		long answer = 0;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int maxLen = Math.min(n - i + 1, n - j + 1);
                for (int len = 1; len <= maxLen; len++) {
                    int nx = i + len - 1, ny = j + len - 1;
                    int zeroCnt = getSum(check, i, j, nx, ny);
                    if (zeroCnt > k) {
                    	continue;
                    }
                    
                    answer = Math.max(answer, getSum(dp, i, j, nx, ny) + arr2[zeroCnt]);
                }
            }
        }
		System.out.print(answer);
	}
	
	static int getSum(int[][] psum, int x1, int y1, int x2, int y2) {
        return psum[x2][y2] - psum[x1 - 1][y2] - psum[x2][y1 - 1] + psum[x1 - 1][y1 - 1];
    }
}
