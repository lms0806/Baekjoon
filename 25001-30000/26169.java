import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr = new int[5][5];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		arr[x][y] = -1;
		dfs(0, 0, x, y);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int sum, int x, int y) {
		if(sum >= 2) {
			answer = 1;
			return;
		}
		
		if(depth == 3 || answer == 1) {
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
				if(arr[nx][ny] != -1) {
					int num = arr[nx][ny];
					arr[nx][ny] = -1;
					dfs(depth + 1, sum + num, nx, ny);
					arr[nx][ny] = num;
				}
			}
		}
	}
}
