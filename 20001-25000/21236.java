import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, answer;
	static boolean[][] num;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		num = new boolean[1001][1001];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

			solve(x, y);
		}
		System.out.print(sb);
	}
	
	public static void solve(int x, int y) {
		if(num[x][y]) {
			return;
		}
		
		for (int j = 0; j < 4; j++) {
			int nx = x + "1012".charAt(j) - '1';
			int ny = y + "2101".charAt(j) - '1';
			
			if(oright(nx, ny) || !num[nx][ny]) {
				continue;
			}
			int count = 0;
			for(int d = 0; d < 4; d++) {
				int nnx = nx + "1012".charAt(d) - '1';
				int nny = ny + "2101".charAt(d) - '1';
				
				if(oright(nnx, nny)) {
					continue;
				}
				
				if(num[nnx][nny]) {
					count++;
				}
			}
			if(count == 3) {
				answer--;
			}
			if(count == 2) {
				answer++;
			}
		}
		num[x][y] = true;
		sb.append(answer).append("\n");
	}
	
	public static boolean oright(int x, int y) {
		if(x < 0 || x > n || y < 0 || y > n) {
			return true;
		}
		return false;
	}
}
