import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int d = Integer.parseInt(br.readLine());
        
        long[] dp = new long[8];
        
        dp[0] = 1;
        while(d --> 0) {
        	long[] temp = new long[8];
        	
        	temp[0] = dp[1] + dp[2];
        	temp[1] = dp[0] + dp[2] + dp[3];
        	temp[2] = dp[0] + dp[1] + dp[3] + dp[4];
        	temp[3] = dp[1] + dp[2] + dp[4] + dp[5];
        	temp[4] = dp[2] + dp[3] + dp[5] + dp[6];
        	temp[5] = dp[3] + dp[4] + dp[7];
        	temp[6] = dp[4] + dp[7];
        	temp[7] = dp[5] + dp[6];
        	
        	for(int i = 0; i < 8; i++) {
        		dp[i] = temp[i] % 1000000007;
        	}
        }
        System.out.print(dp[0]);
    }
}
