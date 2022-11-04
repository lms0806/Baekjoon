import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		
		char[][] board = new char[n * 2][];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			board[i] = (s + new StringBuilder(s).reverse().toString()).toCharArray();
		}
		
		int idx = n - 1;
		for(int i = n; i < n * 2; i++) {
			board[i] = board[idx].clone();
			idx--;
		}
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
		
		board[a][b] = board[a][b] == '#' ? '.' : '#';
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
