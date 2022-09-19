import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 2) {
					x = i;
					y = j;
				}
			}
		}
		System.out.print(solve(n, arr, x, y));
	}
	
	public static String solve(int n, int[][] arr, int x, int y) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 1 && Math.abs(i - x) % 2 == Math.abs(j - y) % 2) {
					return "Kiriya";
				}
			}
		}
		return "Lena";
	}
}
