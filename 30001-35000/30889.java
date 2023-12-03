import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		char[][] board = new char[10][20];
		for(int i = 0; i < 10; i++) {
			Arrays.fill(board[i], '.');
		}
		
		while(t --> 0) {
			String s = br.readLine();
			
			board[s.charAt(0) - 'A'][Integer.parseInt(s.substring(1)) - 1] = 'o';
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
