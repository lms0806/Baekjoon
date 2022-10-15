import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char c = st.nextToken().charAt(0);
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		char[][] answer = new char[n][n];
		if(c == 'U' || c == 'D') {
			for(int i = n - 1; i >= 0; i--) {
				for(int j = 0; j < n; j++) {
					answer[n - 1 - i][j] = input(arr[i][j]);
				}
			}
		}
		else {
			for(int i = 0; i < n; i++) {
				for(int j = n - 1; j >= 0; j--) {
					answer[i][n - 1 - j] = input(arr[i][j]);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(answer[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static char input(int n) {
		if(n == 2) {
			return '5';
		}
		else if(n == 5) {
			return '2';
		}
		else if(n == 1 || n == 8) {
			return (char)(n + '0');
		}
		return '?';
	}
}
