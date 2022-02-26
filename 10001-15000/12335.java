import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			char[][] board = new char[4][4];
			
			for(int j = 0; j < 4; j++) {
				board[j] = br.readLine().toCharArray();
			}
			
			if(i != t) {
				br.readLine();
			}
			
			sb.append("Case #").append(i).append(": ").append(solve(board)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(char[][] board) {
		char[] check = {'O', 'X'};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					if(!checks(board[j][k], check[i])) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					return check[i] + " won";
				}
				
				flag = true;
				for(int k = 0; k < 4; k++) {
					if(!checks(board[k][j], check[i])) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					return check[i] + " won";
				}
			}
			
			boolean flag = true;
			for(int j = 0; j < 4; j++) {
				if(!checks(board[j][j], check[i])) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				return check[i] + " won";
			}
			
			flag = true;
			for(int j = 0; j < 4; j++) {
				if(!checks(board[3 - j][j], check[i])) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				return check[i] + " won";
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(board[i][j] == '.') {
					return "Game has not completed";
				}
			}
		}
		return "Draw";
	}
	
	public static boolean checks(char c, char c1) {
		if(c != 'T' && c != c1) {
			return false;
		}
		return true;
	}
}
