import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				dp[i] = Math.abs(arr[i] - arr[i - 1]);
				dp[i] += dp[i - 1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			sb.append(dp[b] - dp[a]).append("\n");
		}
		System.out.print(sb);
	}
}
