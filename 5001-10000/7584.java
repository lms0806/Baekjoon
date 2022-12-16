import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char c = st.nextToken().charAt(0);
			
			if(c == '#') {
				break;
			}
			
			boolean flag = false;;
			char[][] board = new char[3][3];
			while(st.hasMoreTokens()) {
				int n = Integer.parseInt(st.nextToken()) - 1;
				
				int x = n / 3, y = n % 3;
				
				board[x][y] = c;
				
				String answer = wincheck(board, c);
				
				if(!answer.equals("Draw")) {
					sb.append(answer);
					flag = true;
					break;
				}
				
				c = c == 'X' ? 'O' : 'X';
			}
			
			if(!flag) {
				sb.append("Draw");
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static String wincheck(char[][] arr, char c) {
		for(int i = 0; i < 3; i++) {
			if(c == arr[i][0] && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
				return arr[i][0] + "";
			}
			if(c == arr[0][i] && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
				return arr[0][i] + "";
			}
		}
		
		if(c == arr[0][0] && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
			return arr[0][0] + "";
		}
		if(c == arr[2][0] && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2]) {
			return arr[2][0] + "";
		}
		
		return "Draw";
	}
}
