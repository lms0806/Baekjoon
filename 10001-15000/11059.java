import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int[] dp = new int[s.length() + 1];
		
		for(int i = 1; i <= s.length(); i++) {
			dp[i] = dp[i - 1] + s.charAt(i - 1) - '0';
		}
		
		int answer = 0;
		for(int i = 1; i <= s.length(); i++) {
			for(int j = i + answer + 1; j <= s.length(); j += 2) {
				int len = j - i + 1;
				if(dp[j] - dp[j - len / 2] == dp[j - len / 2] - dp[i - 1]) {
					answer = Math.max(answer, len);
				}
			}
		}
		System.out.print(answer);
	}
}
