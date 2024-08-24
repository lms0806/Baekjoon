import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][m + 1], sum = new int[n + 1][m + 1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				sum[i][j] = arr[i][j] = Integer.parseInt(st.nextToken());
				
				sum[i][j] += sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
			}
		}
		
		int answer = Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				for(int k = 0; k < i; k++) {
					for(int l = 0; l < j; l++) {
						answer = Math.max(answer, sum[i][j] - sum[k][j] - sum[i][l] + sum[k][l]);
					}
				}
			}
		}
		System.out.print(answer);
	}
}
