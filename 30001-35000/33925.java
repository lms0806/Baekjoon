import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[3][];
		for(int i = 0; i < 3; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(n, j, s, h, k, board));
	}
	
	public static int solve(int n, int j, int s, int h, int k, char[][] board) {
		int jump1 = 0, jump2 = 0, slide = 0;
		for(int i = 0; i < n; i++) {
			if(board[2][i] == '^') {
				if(board[1][i] == '.') {
					jump1++;
				}
				else {
					jump2++;
				}
			}
			else if(board[0][i] == 'v') {
				slide++;
			}
		}
		
		if(jump1 > j) {
			jump1 -= j;
			j = 0;
		}
		else {
			j -= jump1;
			jump1 = 0;
		}
		
		if(jump2 * 2 > j) {
			jump2 -= j / 2;
			j = 0;
		}
		else {
			j -= jump2 * 2;
			jump2 = 0;
		}
		
		if(slide > s) {
			slide -= s;
			s = 0;
		}
		else {
			s -= slide;
			slide = 0;
		}
		
		h -= k * (jump1 + jump2 + slide);
		
		return h > 0 ? h : -1;
	}
}
