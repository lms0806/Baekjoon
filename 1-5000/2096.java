import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		long[][] mindp = new long[n][3], maxdp = new long[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 3; i++) {
			mindp[0][i] = arr[0][i];
			maxdp[0][i] = arr[0][i];
		}
		
		for(int i = 1; i < n; i++) {
			mindp[i][0] = Math.min(mindp[i - 1][0], mindp[i - 1][1]) + arr[i][0];
			mindp[i][1] = Math.min(mindp[i - 1][0], Math.min(mindp[i - 1][1], mindp[i - 1][2])) + arr[i][1];
			mindp[i][2] = Math.min(mindp[i - 1][1], mindp[i - 1][2]) + arr[i][2];
			
			maxdp[i][0] = Math.max(maxdp[i - 1][0], maxdp[i - 1][1]) + arr[i][0];
			maxdp[i][1] = Math.max(maxdp[i - 1][0], Math.max(maxdp[i - 1][1], maxdp[i - 1][2])) + arr[i][1];
			maxdp[i][2] = Math.max(maxdp[i - 1][1], maxdp[i - 1][2]) + arr[i][2];
		}
		
		long min = Long.MAX_VALUE, max = 0;
		for(int i = 0; i < 3; i++) {
			min = Math.min(min, mindp[n - 1][i]);
			max = Math.max(max, maxdp[n - 1][i]);
		}
		
		System.out.print(max + " " + min);
	}
}
