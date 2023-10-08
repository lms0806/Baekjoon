import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
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
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			char choice = st.nextToken().charAt(0);
			
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken());
			
			if(choice == 'r') {
				for(int i = 0; i < m; i++) {
					arr[a][i] += b;
				}
			}
			else {				
				for(int i = 0; i < n; i++) {
					arr[i][a] += b;
				}
			}
		}
		
		int sum = 0;
		int max = 0, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sum += arr[i][j];
				
				min = Math.min(min, arr[i][j]);
				max = Math.max(max, arr[i][j]);
			}
		}
		
		System.out.print(sum + " " + min + " " + max);
	}
}
