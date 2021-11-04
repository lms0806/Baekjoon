import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int k = 1; k <= t; k++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append("Data set ").append(k).append(": ").append(solve(st.nextToken(), st.nextToken(), st.nextToken())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String a, String b, String c) {
		int[][] dp = new int[a.length() + 1][b.length() + 1];
		
		for(int i = 0; i <= a.length(); i++) {
			for(int j = 0; j <= b.length(); j++) {
				if(i > 0 && dp[i - 1][j] == i + j - 1 && a.charAt(i - 1) == c.charAt(i + j - 1)) {
					dp[i][j] = dp[i - 1][j] + 1;
				}
				if(j > 0 && dp[i][j - 1] == i + j - 1 && b.charAt(j - 1) == c.charAt(i + j - 1)) {
					dp[i][j] = dp[i][j - 1] + 1;
				}
			}
		}
		
		return dp[a.length()][b.length()] == c.length() ? "yes" : "no";
	}
}
