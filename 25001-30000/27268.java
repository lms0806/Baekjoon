import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		
		char c = 'a';
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int startx = Integer.parseInt(st.nextToken()) - 1, starty = Integer.parseInt(st.nextToken()) - 1;
			int endx = Integer.parseInt(st.nextToken()) - 1, endy = Integer.parseInt(st.nextToken()) - 1;
			
			for(int i = startx; i <= endx; i++) {
				
				if(i == startx || i == endx) {
					for(int j = starty; j <= endy; j++) {
						board[i][j] = c;
					}
				}
				else {
					board[i][starty] = c;
					board[i][endy] = c;
				}
			}
			c++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
}
