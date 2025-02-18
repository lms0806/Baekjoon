import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			board = new char[3][3];
			for(int i = 0; i < 3; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			char c = br.readLine().charAt(0);
			
			solve(c);
			
			sb.append("Case ").append(t).append(":\n");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					sb.append(board[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void solve(char c) {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == c && board[i][1] == c && board[i][2] == '-') {
				board[i][2] = c;
				return;
			}
			else if(board[i][1] == c && board[i][2] == c && board[i][0] == '-') {
				board[i][0] = c;
				return;
			}
			else if(board[i][2] == c && board[i][0] == c && board[i][1] == '-') {
				board[i][1] = c;
				return;
			}
			else if(board[0][i] == c && board[1][i] == c && board[2][i] == '-') {
				board[2][i] = c;
				return;
			}
			else if(board[1][i] == c && board[2][i] == c && board[0][i] == '-') {
				board[0][i] = c;
				return;
			}
			else if(board[2][i] == c && board[0][i] == c && board[1][i] == '-') {
				board[1][i] = c;
				return;
			}
		}
		
		if(board[0][0] == c && board[1][1] == c && board[2][2] == '-') {
			board[2][2] = c;
			return;
		}
		else if(board[2][2] == c && board[1][1] == c && board[0][0] == '-') {
			board[0][0] = c;
			return;
		}
		else if(board[0][0] == c && board[2][2] == c && board[1][1] == '-') {
			board[1][1] = c;
			return;
		}
		
		if(board[2][0] == c && board[1][1] == c && board[0][2] == '-') {
			board[0][2] = c;
			return;
		}
		else if(board[2][0] == c && board[0][2] == c && board[1][1] == '-') {
			board[1][1] = c;
			return;
		}
		else if(board[0][2] == c && board[1][1] == c && board[2][0] == '-') {
			board[2][0] = c;
			return;
		}
	}
}
