import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
        	board[i] = br.readLine().toCharArray();
        }
        
        System.out.print(solve(n, board));
    }
    
    public static int solve(int n, char[][] board) {
    	for(int i = 0; i < n; i++) {
    		int cb = 0, cw = 0, rb = 0, rw = 0;
    		for(int j = 0; j < n; j++) {
    			if(board[i][j] == 'B') {
    				cb++;
    			}
    			else {
    				cw++;
    			}
    			
    			if(board[j][i] == 'B') {
    				rb++;
    			}
    			else {
    				rw++;
    			}
    		}
    		
    		if(cb != cw || rb != rw) {
    			return 0;
    		}
    		
    		for(int j = 2; j < n; j++) {
    			if(board[i][j - 2] == board[i][j - 1] && board[i][j - 1] == board[i][j]) {
    				return 0;
    			}
    			if(board[j - 2][i] == board[j - 1][i] && board[j - 1][i] == board[j][i]) {
    				return 0;
    			}
    		}
    	}
    	return 1;
    }
}
