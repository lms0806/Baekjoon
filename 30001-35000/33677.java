import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] dp = new long[2000001];
		long[] day = new long[2000001];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		Arrays.fill(day, Integer.MAX_VALUE);
		
		dp[0] = 0;
		day[0] = 0;
		
		for(int i = 0; i <= n; i++) {			
			if(i + 1 <= n) {
				update(dp, day, i + 1, day[i] + 1, dp[i] + 1);
			}
			
			if(i * 3 <= n) {
				update(dp, day, i * 3, day[i] + 1, dp[i] + 3);
			}
			
			long num = 1L * i * i;
			if(num <= n) {
				update(dp, day, (int)num, day[i] + 1, dp[i] + 5);
			}
		}
		
		System.out.println(day[n] + " " + dp[n]);
	}
	
	static void update(long[] dp, long[] day, int idx, long newDay, long newWater) {
		if (newDay < day[idx]) {
			day[idx] = newDay;
			dp[idx] = newWater;
		} else if (newDay == day[idx] && newWater < dp[idx]) {
			dp[idx] = newWater;
		}
	}
}
