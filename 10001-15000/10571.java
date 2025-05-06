import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			double[][] arr = new double[n][2];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 2; j++) {
					arr[i][j] = Double.parseDouble(st.nextToken());
				}
			}
			
			int[] dp = new int[n];
			
			Arrays.fill(dp, 1);
			
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1]) {
						dp[j] = Math.max(dp[j], dp[i] + 1);
					}
				}
			}
			
			int answer = 1;
			for(int d : dp) {
				answer = Math.max(answer, d);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
