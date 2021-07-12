import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String str = br.readLine(), str1 = br.readLine();
		
		int[][] dp = new int[str.length() + 1][str1.length() + 1];
		
		int size = 0;
		for(int i = 1; i <= str.length(); i++) {
			for(int j = 1; j <= str1.length(); j++) {
				if(str.charAt(i - 1) == str1.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					size = Math.max(size,  dp[i][j]);
				}
			}
		}
		System.out.print(size);
	}
}
