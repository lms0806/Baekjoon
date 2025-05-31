import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] white, black;
	static int[][][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		white = new int[1001];
		black = new int[1001];
		
		int idx = 0;
		String s = "";
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			white[idx] = Integer.parseInt(st.nextToken());
			black[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		dp = new int[idx + 1][16][16];
		solve(idx, 15, 15);
		
		System.out.print(dp[idx][15][15]);
	}
	
	public static int solve(int idx, int wIdx, int bIdx) {
		if(idx == -1 || (wIdx == -1 && bIdx == -1)) {
			return 0;
		}
		
		int num = dp[idx][wIdx][bIdx];
		
		if(num != 0) {
			return num;
		}
		
		num = Math.max(num, solve(idx - 1, wIdx, bIdx));
		
		if(wIdx > 0) {
			num = Math.max(num, solve(idx - 1, wIdx - 1, bIdx) + white[idx]);
		}
		
		if(bIdx > 0) {
			num = Math.max(num, solve(idx - 1, wIdx, bIdx - 1) + black[idx]);
		}
		
		dp[idx][wIdx][bIdx] = num;
		
		return num;
	}
}
