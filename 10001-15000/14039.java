import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[4][4];
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(i == 0) {
					sum += arr[i][j];
				}
			}
		}
		
		System.out.print(solve(arr, sum) ? "magic" : "not magic");
	}
	
	public static boolean solve(int[][] arr, int sum) {
		for(int i = 0; i < 4; i++) {
			
			int a = 0, b = 0;
			for(int j = 0; j < 4; j++) {
				a += arr[i][j];
				b += arr[j][i];
			}
			
			if(sum != a || sum != b) {
				return false;
			}
		}
		
		return true;
	}
}
