import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] queenx = {1, 1, 1, 0, -1, -1, -1, 0};
	static int[] queeny = {1, 0, -1, -1, -1, 0, 1, 1};
	static int[] knightx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] knighty = {2, 1, -1, -2, -2, -1, 1, 2};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		boolean[][] check = new boolean[n + 1][m + 1];
		boolean[][] visited = new boolean[n + 1][m + 1];
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[][] queen = new int[t][2];
		for(int i = 0; i < t; i++) {
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			queen[i][0] = x;
			queen[i][1] = y;
		}
		
		st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			check[x][y] = true;
			for(int i = 0; i < 8; i++) {
				int nx = x + knightx[i], ny = y + knighty[i];
				
				if(nx > 0 && nx <= n && ny > 0 && ny <= m) {
					visited[nx][ny] = true;
				}
			}
		}
		
		st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			check[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
		}
		
		for(int i = 0; i < queen.length; i++) {
			check[queen[i][0]][queen[i][1]] = true;
			for(int j = 0; j < 8; j++) {
				int nx = queen[i][0], ny = queen[i][1];
				while(true) {
					nx += queenx[j];
					ny += queeny[j];
					
					if(nx < 1 || nx > n || ny < 1 || ny > m || check[nx][ny]) {
						break;
					}
					
					visited[nx][ny] = true;
				}
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(!check[i][j] && !visited[i][j]) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
