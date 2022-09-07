import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String a = br.readLine(), b = br.readLine();
		
		int startx = a.charAt(0) - 'a', starty = a.charAt(1) - '1';
		int endx = b.charAt(0) - 'a', endy = b.charAt(1) - '1';
		
		System.out.print(bfs(startx, starty, endx, endy));
	}
	
	public static int bfs(int x, int y, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[8][8];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		int[] dx = {2, 2, 1, -1, -2, -2, -1, 1};
		int[] dy = {1, -1, -2, -2, -1, 1, 2, 2};
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
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
		return 0;
	}
}
