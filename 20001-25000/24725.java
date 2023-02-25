import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[] mbti = {"ENFP", "ENFJ", "ENTP", "ENTJ", "ESFP", "ESFJ", "ESTP", "ESTJ", "INFP", "INFJ", "INTP", "INTJ", "ISFP", "ISFJ", "ISTP", "ISTJ"};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String[][] board = new String[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j) + "";
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m - 3; j++) {
				String s = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i][j + 3];
				
				answer += contain(s);
			}
		}
		
		for(int i = 0; i < n - 3; i++) {
			for(int j = 0; j < m; j++) {
				String s = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i + 3][j];
				
				answer += contain(s);
			}
		}
		
		for(int i = 0; i < n - 3; i++) {
			for(int j = 0; j < m - 3; j++) {
				String s = board[i][j] + board[i + 1][j + 1] + board[i + 2][j + 2] + board[i + 3][j + 3];
				
				answer += contain(s);
			}
		}
		
		for(int i = n - 1; i > 2; i--) {
			for(int j = 0; j < m - 3; j++) {
				String s = board[i][j] + board[i - 1][j + 1] + board[i - 2][j + 2] + board[i - 3][j + 3];
				
				answer += contain(s);
			}
		}
		
		System.out.print(answer);
	}
	
	public static int contain(String s) {
		int result = 0;
		
		if(check(s)) {
			result++;
		}
		if(check(new StringBuilder(s).reverse().toString())) {
			result++;
		}
		
		return result;
	}
	
	public static boolean check(String s) {
		for(int k = 0; k < mbti.length; k++) {
			if(mbti[k].equals(s)) {
				return true;
			}
		}
		return false;
	}
}
