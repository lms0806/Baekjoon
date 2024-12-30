import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1], dp = new int[1000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			int num = arr[i];
			
			dp[num] = Math.max(dp[num], dp[num - 1] + 1);
			answer = Math.max(answer, dp[num]);
		}
		System.out.print(answer);
	}
}
