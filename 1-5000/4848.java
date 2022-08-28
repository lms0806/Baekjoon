import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dp = new String[16];
		dp[0] = "{}";
		
		for(int i = 1; i < 16; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("{");
			dp[i] = "{";
			for(int j = 0; j < i - 1; j++) {
				sb.append(dp[j]).append(",");
			}
			sb.append(dp[i - 1]).append("}");
			
			dp[i] = sb.toString();
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s1 = br.readLine(), s2 = br.readLine();
			
			int n1 = 0, n2 = 0;
			for(int i = 0; i < 16; i++) {
				if(dp[i].equals(s1)) {
					n1 = i;
				}
				if(dp[i].equals(s2)) {
					n2 = i;
				}
			}
			
			sb.append(dp[n1 + n2]).append("\n");
		}
		System.out.print(sb);
	}
}
