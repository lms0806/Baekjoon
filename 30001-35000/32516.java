import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		
		System.out.print(solve(br.readLine().toCharArray()));
	}
	
	public static int solve(char[] board) {
		int answer = 0;
		for(int i = 0; i < board.length / 2; i++) {
			int s = i, e = board.length - i - 1;
			
			if(board[s] != '?' && board[e] == '?') {
				answer++;
				board[e] = board[s];
			}
			else if(board[e] != '?' && board[s] == '?') {
				answer++;
				board[s] = board[e];
			}
			else if(board[s] == '?' && board[e] == '?'){
				answer += 26;
			}
			else if(board[s] != board[e]) {
				return 0;
			}
		}
		return answer;
	}
}
