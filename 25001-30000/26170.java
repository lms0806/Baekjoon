import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = Integer.MAX_VALUE;
	static int[][] arr = new int[5][5];
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws NumberFormatException, IOException {
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
		
		dfs(x, y, 0, 0);
		
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
	
	public static void dfs(int x, int y, int count, int move) {
		if(count >= 3) {
			answer = Math.min(answer, move);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && arr[nx][ny] != -1) {
				if(arr[nx][ny] == 1) {
					arr[nx][ny] = -1;
					dfs(nx, ny, count + 1, move + 1);
					arr[nx][ny] = 1;
				}
				else {
					arr[nx][ny] = -1;
					dfs(nx, ny, count, move + 1);
					arr[nx][ny] = 0;
				}
			}
		}
	}
}
