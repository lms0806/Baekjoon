import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			char[][] board = new char[n][m];
			
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m - 2; j++) {
					if(board[i][j] == '>' && board[i][j + 1] == 'o' && board[i][j + 2] == '<') {
						answer++;
					}
				}
			}
			
			for(int i = 0; i < n - 2; i++) {
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'v' && board[i + 1][j] == 'o' && board[i + 2][j] == '^') {
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
