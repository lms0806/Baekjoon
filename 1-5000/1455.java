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
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		int answer = 0;
		for(int i = n - 1; i >= 0; i--) {
			for(int j = m - 1; j >= 0; j--) {
				if(arr[i][j] == 1) {
					change(arr, i, j);
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void change(int[][] arr, int a, int b) {
		for(int i = a; i >= 0; i--) {
			for(int j = b; j >= 0; j--) {
				arr[i][j] = arr[i][j] == 1 ? 0 : 1;
			}
		}
	}
}
