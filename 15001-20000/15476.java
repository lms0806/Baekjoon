import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int sum = 0;
				
				for(int k = 0; k < n; k++) {
					for(int l = 0; l < m; l++) {
						sum += Math.min(Math.abs(i - k), Math.abs(j - l)) * arr[k][l];
					}
				}
				
				answer = Math.min(answer, sum);
			}
		}
		System.out.print(answer);
	}
}
