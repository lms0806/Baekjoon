import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int t = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(i == 0 || s.charAt(i - 1) == '+') {
				t++;
			}
			if(i > 0 && s.charAt(i) == '-') {
				t--;
			}
			max = Math.max(max, t);
			min = Math.min(min, t);
		}
		
		char[][] board = new char[max - min + 1][n];
		for(int i = 0; i < board.length; i++) {
			Arrays.fill(board[i], '.');
		}
		
		t = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0 || s.charAt(i - 1) == '+') {
				t++;
			}
			if(i > 0 && s.charAt(i) == '-') {
				t--;
			}
			
			board[t - min][i] = s.charAt(i) != '=' ? s.charAt(i) == '+' ? '/' : '\\' : '_';
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = board.length - 1; i >= 0; i--) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
}
