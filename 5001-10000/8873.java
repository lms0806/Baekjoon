import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] r = new int[n][m], g = new int[n][m], b = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				r[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				g[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int sum = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 1; j++) {
				sum += Math.abs(r[i + 1][j] - r[i][j]) + Math.abs(r[i][j + 1] - r[i][j]);
				sum += Math.abs(g[i + 1][j] - g[i][j]) + Math.abs(g[i][j + 1] - g[i][j]);
				sum += Math.abs(b[i + 1][j] - b[i][j]) + Math.abs(b[i][j + 1] - b[i][j]);
			}
		}
		
		sum /= n * m * 2;
		
		System.out.print(sum < 9 ? 4 : sum < 23 ? 1 : sum < 54 ? 2 : 3);
	}
}
