import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int size = 1;
			while(size * size < s.length()) {
				size++;
			}
			
			char[][] board = new char[size][size];
			
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(i * size + j < s.length()) {
						board[j][size - 1 - i] = s.charAt(i * size + j);
					}
				}
			}
			
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(board[i][j] != '\0') {
						sb.append(board[i][j]);
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
