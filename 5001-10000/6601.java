import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {2, 2, 1, -1, -2, -2, -1, 1};
	static int[] dy = {1, -1, -2, -2, -1, 1, 2, 2};
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			String s1 = st.nextToken(), s2 = st.nextToken();
			
			int answer = 0;
			if(!s1.equals(s2)) {
				answer = bfs(s1.charAt(0) - 'a', s1.charAt(1) - '1', s2.charAt(0) - 'a', s2.charAt(1) - '1');
			}
			
			sb.append("To get from ").append(s1).append(" to ").append(s2).append(" takes ").append(answer).append(" knight moves.").append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[8][8];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == endx && now[1] == endy) {
				return now[2];
			}
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
					if(!visited[nx][ny]) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return 0;
	}
}
