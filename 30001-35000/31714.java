import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr[i]);
		}
		
		System.out.print(solve(arr, d));
	}
	
	public static String solve(int[][] arr, int d) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i - 1][j] - arr[i][j] >= d) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
