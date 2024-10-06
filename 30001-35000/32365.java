import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		boolean[][] check = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			int[] alpha = new int[26];
			for(char c : board[i]) {
				alpha[c - 'a']++;
			}
			
			for(int j = 0; j < board[i].length; j++) {
				if(alpha[board[i][j] - 'a'] > 1) {
					check[i][j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(boolean[] b : check) {
			int count = 0;
			for(int i = 1; i < b.length; i++) {
				if(b[i - 1] != b[i]) {
					count++;
				}
			}
			sb.append(count == b.length - 1 ? 'T' :'F').append("\n");
		}
		System.out.print(sb);
	}
}
