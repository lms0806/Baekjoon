import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr[i]);
		}
		
		System.out.print(solve(arr) ? "YES" : "NO");
	}
	
	public static boolean solve(int[][] arr) {
		for(int i = 0; i < 3; i++) {
			if(arr[0][i] != arr[1][i]) {
				return false;
			}
		}
		
		return arr[0][0] * arr[0][0] + arr[0][1] * arr[0][1] == arr[0][2] * arr[0][2];
	}
}
