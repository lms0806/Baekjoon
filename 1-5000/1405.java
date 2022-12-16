import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static double answer = 0;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static double[] arr = new double[4];
	static boolean[][] visited = new boolean[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 4; i++) {
			arr[i] = Double.parseDouble(st.nextToken()) * 0.01;
		}
		
		dfs(15, 15, 1.0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, double num) {
		if(n == 0) {
			answer += num;
			return;
		}
		
		visited[x][y] = true;
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(!visited[nx][ny]) {
				n--;
				dfs(nx, ny, num * arr[i]);
				visited[nx][ny] = false;
				n++;
			}
		}
	}
}
