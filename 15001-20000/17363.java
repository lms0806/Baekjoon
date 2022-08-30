import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m], answer = new char[m][n];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		char[] before = {'.', 'O', '-', '|', '/', '\\', '^', '<', 'v', '>'};
		char[] after = {'.', 'O', '|', '-', '\\', '/', '<', 'v', '>', '^'};
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				answer[i][j] = board[j][i];
				for(int k = 0; k < before.length; k++) {
					if(answer[i][j] == before[k]) {
						answer[i][j] = after[k];
						break;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = m - 1; i >= 0; i--) {
			sb.append(answer[i]).append("\n");
		}
		System.out.print(sb);
		
	}
}
