import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			char[][] board = new char[n][];
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			sb.append("Data Set ").append(t).append(":\n");
			for(int i = 0; i < m; i++) {
				boolean oil = false;
				int sum = 0;
				for(int j = 0; j < n; j++) {
					if(board[j][i] == 'X') {
						oil = true;
						break;
					}
					else {
						sum += board[j][i] == 'S' ? 1 : 3;
					}
				}
				sb.append(oil ? sum : "N").append(" ");
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}
