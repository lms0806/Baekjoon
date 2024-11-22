import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n], dp = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			st.nextToken();
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		if(n > 1) {
			dp[1] = Math.max(arr[0], arr[1]);
		}
		for(int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
		}
		System.out.print(dp[n - 1]);
	}
}
