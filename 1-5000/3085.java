import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n][n];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = max_num();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1; j++) {
				swap(i, j, true);
				
				answer = Max(answer, max_num());
				
				swap(i, j, true);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1; j++) {
				swap(i, j, false);
				
				answer = Max(answer, max_num());
				
				swap(i, j, false);
			}
		}
		
		System.out.print(answer);
	}
	
	public static void swap(int i, int j, boolean flag) {
		if(flag) {
			char temp = board[i][j];
			board[i][j] = board[i][j + 1];
			board[i][j + 1] = temp;
		}
		else {
			char temp = board[j][i];
			board[j][i] = board[j + 1][i];
			board[j + 1][i] = temp;
		}
	}
	
	public static int max_num() {
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			int sum1 = 1, sum2 = 1;
			for(int j = 0; j < n - 1; j++) {
				if(board[i][j] == board[i][j + 1]) {
					sum1++;
				}
				else {
					max = Max(max, sum1);
					sum1 = 1;
				}
				if(board[j][i] == board[j + 1][i]) {
					sum2++;
				}
				else {
					max = Max(max, sum2);
					sum2 = 1;
				}
			}
			max = Max(max, sum1);
			max = Max(max, sum2);
		}
		
		return max;
	}
	
	public static int Max(int a, int b) {
		return Math.max(a, b);
	}
}
