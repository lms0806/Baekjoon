import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer= 0;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] > arr[i - 1][j] * 2) {
					answer++;
				}
			}
		}
		System.out.print(answer * a);
	}
}
