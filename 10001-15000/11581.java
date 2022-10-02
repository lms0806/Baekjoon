import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[][] check = new boolean[n + 1][n + 1];
		
		for(int i = 1; i < n; i++) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				check[i][Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(check[i][k] && check[k][j]) {
						check[i][j] = true;
					}
				}
			}
		}
		
		String answer = "NO CYCLE";
		for(int i = 1; i <= n; i++) {
			if(check[1][i] && check[i][i]) {
				answer = "CYCLE";
				break;
			}
		}
		System.out.print(answer);
	}
}
