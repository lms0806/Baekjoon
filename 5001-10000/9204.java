import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 1, -1, -1};
	static int[] dy = {1, -1, -1, 1};
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startx = st.nextToken().charAt(0) - 'A';
			int starty = Integer.parseInt(st.nextToken()) - 1;
			int endx = st.nextToken().charAt(0) - 'A';
			int endy = Integer.parseInt(st.nextToken()) - 1;
			
			sb.append(bfs(startx, starty, endx, endy)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs(int startx, int starty, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		Queue<String> path = new LinkedList<>();
		boolean[][] visited = new boolean[8][8];
		queue.add(new int[] {startx, starty, 0});
		path.add((char)(startx + 'A') + " " + (starty + 1) + " ");
		visited[startx][starty] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			String nowpath = path.poll();
			
			if(now[0] == endx && now[1] == endy) {
				return now[2] + " " + nowpath;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0];
				int ny = now[1];
				
				while(true) {
					if(nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
						if(!visited[nx][ny]) {
							visited[nx][ny] = true;
							queue.add(new int[] {nx, ny, now[2] + 1});
							path.add(nowpath + (char)(nx + 'A') + " " + (ny + 1) + " ");
						}
					}
					else {
						break;
					}
					
					nx += dx[i];
					ny += dy[i];
				}
			}
		}
		
		return "Impossible";
	}
}
