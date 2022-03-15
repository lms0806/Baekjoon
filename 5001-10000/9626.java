import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[m + u + d][n + l + r];
		
		for(int i = 0; i < arr.length; i++) {
			char c = i % 2 == 0 ? '#' : '.';
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = c;
				c = c == '.' ? '#' : '.';
			}
		}
		
		for(int i = 0; i < m; i++) {
			char[] c = br.readLine().toCharArray();
			
			for(int j = 0; j < c.length; j++) {
				arr[u][l + j] = c[j];
			}
			u++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : arr) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
