import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] board;
	static boolean[][] visited;
	static int n, m, answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		HashSet<Character> set = new HashSet<>();
		set.add(board[0][0]);
		dfs(0, 0, 1, set);
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, int depth, HashSet<Character> set) {
		if(depth > answer) {
			answer = depth;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if(!visited[nx][ny] && !set.contains(board[nx][ny])) {
					visited[nx][ny] = true;
					set.add(board[nx][ny]);
					dfs(nx, ny, depth + 1, set);
					visited[nx][ny] = false;
					set.remove(board[nx][ny]);
				}
			}
		}
	}
}
