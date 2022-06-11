import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1};
	static char[][] board;
	static int n, k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[2][n];
		for(int i = 0; i < 2; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		int[][] visited = new int[2][n];
		queue.add(new int[] {0, 0});// 왼 오, 길이
		visited[0][0] = 1;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(visited[now[0]][now[1]] > now[1] + 1) {
				continue;
			}
			
			if(now[1] + k >= n) {
				return 1;
			}
			
			for(int i = 0; i < 2; i++) {
				int nx = now[1] + dx[i];
				
				if(nx >= 0 && board[now[0]][nx] == '1' && visited[now[0]][nx] == 0) {
					visited[now[0]][nx] = visited[now[0]][now[1]] + 1;
					queue.add(new int[] {now[0], nx});
				}
			}
			
			int gill = now[0] == 0 ? 1 : 0;
			int nx = now[1] + k;
			if(board[gill][nx] == '1' && visited[gill][nx] == 0) {
				visited[gill][nx] = visited[now[0]][now[1]] + 1;
				queue.add(new int[] {gill, nx});
			}
		}
		
		return 0;
	}
}
