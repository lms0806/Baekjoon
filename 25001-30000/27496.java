import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		
		for(int i = 1; i < l; i++) {
			dp[i] = dp[i - 1] + arr[i];
		}
		
		for(int i = l; i < n; i++) {
			dp[i] = dp[i - 1] + arr[i] - arr[i - l];
		}
		
		int answer = 0;
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] >= 129 && dp[i] <= 138) {
				answer++;
			}
		}
		
		System.out.print(answer);
	}
}
