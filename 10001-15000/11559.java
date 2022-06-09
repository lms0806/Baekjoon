import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[][] board = new char[12][6];
	static boolean[][] visited;
	static ArrayList<int[]> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		for(int i = 0; i < 12; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		while(true) {
			visited = new boolean[12][6];
			boolean flag = false;
			
			for(int i = 0; i < 12; i++) {
				for(int j = 0; j < 6; j++) {
					if(board[i][j] != '.' && !visited[i][j]) {
						
						bfs(i, j, board[i][j]);
					}
					
					if(arr.size() >= 4) {
						flag = true;
					}
					
					if(arr.size() < 4) {
						for(int k = 0; k < arr.size(); k++) {
							visited[arr.get(k)[0]][arr.get(k)[1]] = false;
						}
					}
					arr.clear();
				}
			}
			
			if(flag) {
				answer++;
			}
			else {
				break;
			}
			
			for(int i = 0; i < 12; i++) {
				for(int j = 0; j < 6; j++) {
					if(visited[i][j]) {
						board[i][j] = '.';
					}
				}
			}
			
			for(int i = 11; i >= 0; i--) {
				for(int j = 0; j < 6; j++) {
					int temp = -1;
					if(board[i][j] != '.') {
						for(int k = i; k < 12; k++) {
							if(board[k][j] == '.') {
								temp = k;
							}
						}
					}
					
					if(temp != -1) {
						board[temp][j] = board[i][j];
						board[i][j] = '.';
					}
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x, int y, char check) {
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.add(new int[] {x, y});
		arr.add(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < 12 && ny >= 0 && ny < 6) {
					if(!visited[nx][ny] && board[nx][ny] == check) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
						arr.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
