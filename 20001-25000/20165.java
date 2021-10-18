import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dr = {-1, 0, 1, 0}, dc = { 0, 1, 0, -1};
	static int[][] num;
	static int n, m, answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		num = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = num[i][j];
			}
		}
		
		while(r --> 0) {
			st = new StringTokenizer(br.readLine());

			attack(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, st.nextToken().charAt(0));

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			num[a][b] = arr[a][b];
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer);
		for(int[] a : num) {
			sb.append("\n");
			for(int aa : a) {
				sb.append(aa == 0 ? "F " : "S ");
			}
		}
		System.out.print(sb);
	}
	
	public static void attack(int a, int b, char c) {
		int k = c == 'E' ? 1 : c == 'W' ? 3 : c == 'S' ? 2 : 0;
		
		int h = num[a][b];
		int nr = a, nc = b;
		while(h > 0) {
			if(num[nr][nc] > 0) {
				h = Math.max(h, num[nr][nc]);
				num[nr][nc] = 0;
				answer++;
			}
			h--;
			
			nr += dr[k];
			nc += dc[k];
			
			if(!check(nr, nc)) {
				break;
			}
		}
	}
	
	public static boolean check(int r, int c) {
		if(r >= 0 && r < n && c >= 0 && c < m) {
			return true;
		}
		return false;
	}
}
