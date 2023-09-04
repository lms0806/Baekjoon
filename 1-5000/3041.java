import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		char[][] board = new char[4][4];
		
		for(int i = 0; i < 4; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		char c = 'A';
		int answer = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(board[i][j] != c) {
					for(int k = 0; k < 4; k++) {
						boolean flag = false;
						for(int l = 0; l < 4; l++) {
							if(board[k][l] == c) {
								answer += Math.abs(k - i) + Math.abs(l - j);
								flag = true;
								break;
							}
						}
						
						if(flag) {
							break;
						}
					}
				}
				
				c++;
			}
		}
		System.out.print(answer);
	}
}
