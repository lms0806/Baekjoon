import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine(), b = br.readLine();
		
		int[][] dp = new int[a.length() + 1][b.length() + 1];
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				dp[i + 1][j + 1] = a.charAt(i) == b.charAt(j) ? dp[i][j] + 1 : Math.max(dp[i + 1][j], dp[i][j + 1]);
			}
		}
		System.out.print(dp[a.length()][b.length()]);
	}
}
