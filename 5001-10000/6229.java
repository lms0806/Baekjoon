import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int m, n, m1, m2;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		m1 = Integer.parseInt(st.nextToken());
		m2 = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 3) {
					x = i;
					y = j;
				}
			}
		}
		
		System.out.print(bfs(x, y));
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		arr[x][y] = 0;
		
		int[] dx = {-m1, -m1, m1, m1, -m2, -m2, m2, m2};
		int[] dy = {-m2, m2, -m2, m2, -m1, m1, -m1, m1};
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
				    if(arr[nx][ny] == 4){
				        return now[2] + 1;
				    }
					if(arr[nx][ny] == 1) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						arr[nx][ny] = 0;
					}
				}
			}
		}
		return -1;
	}
}
