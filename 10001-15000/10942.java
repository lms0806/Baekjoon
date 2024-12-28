import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		boolean[][] check = new boolean[n + 1][n + 1];
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			check[i][i] = true;
			
			if(arr[i] == arr[i - 1]) {
				check[i - 1][i] = true;
			}
		}
		
		for(int i = n - 1; i > 0; i--) {
			for(int j = i + 2; j <= n; j++) {
				if(arr[i] == arr[j] && check[i + 1][j - 1]) {
					check[i][j] = true;
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			sb.append(check[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}
