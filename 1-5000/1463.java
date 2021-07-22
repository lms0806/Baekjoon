import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		dp[0] = dp[1] = 0;
		
		System.out.print(solve(n, 0));
	}
	
	public static int solve(int n, int count) {
		if(n < 2) {
			return count;
		}
		return Math.min(solve(n / 2, count + 1 + (n % 2)), solve(n / 3, count + 1 + (n % 3)));
	}
}
