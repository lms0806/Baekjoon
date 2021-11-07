import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] arr;
	static boolean[][] visited;
	static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			sb.append("Case #").append(i).append(":").append("\n");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			arr = new int[r][c];
			for(int j = 0; j < r; j++) {
				String s = br.readLine();
				for(int k = 0; k < c; k++) {
					arr[j][k] = s.charAt(k) - '0';
				}
			}
			
			int n = Integer.parseInt(br.readLine());
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				char check = st.nextToken().charAt(0);
				
				if(check == 'Q') {
					int answer = 0;
					
					visited = new boolean[r][c];
					for(int j = 0; j < r; j++) {
						for(int k = 0; k < c; k++) {
							if(!visited[j][k] && arr[j][k] == 1) {
								bfs(j, k);
								answer++;
							}
						}
					}
					sb.append(answer).append("\n");
				}
				else {
					arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
				}
			}
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
					if(arr[nx][ny] != 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
