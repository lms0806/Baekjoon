import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n], dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			min = Math.min(arr[i], min);
			
			dp[i] = i > 0 ? Math.max(dp[i - 1], arr[i] - min) : 0;
			
			sb.append(dp[i]).append(" ");
		}
		System.out.print(sb);
	}
}
