import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n], b = new int[m];
		int[][] c = new int[n][m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		
		c[0][0] = a[0] == b[0] ? 0 : 1;
		for(int i = 1; i < n; i++) {
			c[i][0] = c[i - 1][0] == a[i] ? 0 : 1;
		}
		for(int i = 1; i < m; i++) {
			c[0][i] = c[0][i - 1] == b[i] ? 0 : 1;
		}
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				c[i][j] = c[i - 1][j] == c[i][j - 1] ? 0 : 1;
			}
		}
		System.out.print(c[n - 1][m - 1]);
	}
}
