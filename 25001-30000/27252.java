import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] arr = new int[s.length() + 1];
		
		int num = 0, max = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				num++;
			}
			else {
				num--;
			}
			
			arr[i + 1] = num;
			max = Math.max(max, arr[i + 1]);
		}
		
		char[][] board = new char[max][s.length()];
		for(int i = 0; i < board.length; i++) {
			Arrays.fill(board[i], '.');
		}
		
		for(int i = 1; i <= s.length(); i++) {
			if(arr[i - 1] < arr[i]) {
				board[max - arr[i]][i - 1] = '/';
			}
			else {
				board[max - arr[i - 1]][i - 1] = '\\';
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < board.length; i++) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
}
