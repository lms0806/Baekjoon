import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int y = Integer.parseInt(st.nextToken()) - 1, x = Integer.parseInt(st.nextToken()) - 1;
		
		char[][] board = new char[10][10];
		
		for(int i = 0; i < 10; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < 10; i++) {
			if(new String(board[i]).contains("o")) {
				continue;
			}
			
			for(int j = 0; j < 10; j++) {
				boolean flag = false;
				for(int k = 0; k < 10; k++) {
					if(board[k][j] == 'o') {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					continue;
				}
				
				answer = Math.min(answer, Math.abs(j - x) + Math.abs(i - y));
			}
		}
		System.out.print(answer);
	}
}
