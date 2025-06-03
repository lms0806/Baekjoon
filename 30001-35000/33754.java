import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[2][n];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(solve(arr));
	}
	
	public static int solve(int[][] arr) {
		for(int i = 0; i < arr[0].length; i++) {
			if(arr[0][i] == 0 && arr[1][i] == 0) {
				return 0;
			}
			
			if(i > 0) {
				if((arr[0][i] == 0 && arr[1][i - 1] == 0) || (arr[0][i - 1] == 0 && arr[1][i] == 0)) {
					return 0;
				}
			}
		}
		
		for(int i = 0; i < arr[0].length; i++) {
			if(arr[0][i] == 0 || arr[1][i] == 0) {
				return 1;
			}
		}
		return 2;
	}
}
