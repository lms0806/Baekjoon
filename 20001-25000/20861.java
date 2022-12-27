import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		int x = 0, y = 0;
		while(true) {
			if(board[x][y] == 'v') {
				x++;
			}
			else if(board[x][y] == '^') {
				x--;
			}
			else if(board[x][y] == '>') {
				y++;
			}
			else if(board[x][y] == '<') {
				y--;
			}
			
			if(visited[x][y]) {
				return "cykel";
			}
			else if(board[x][y] == 'A') {
				return "sushi";
			}
			else if(board[x][y] == 'B') {
				return "samuraj";
			}
			
			visited[x][y] = true;
		}
	}
}
