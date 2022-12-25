import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static char[][] board;
	static String[][] cubes = {{"1000", "1111", "1000"}, {"0100", "1111", "1000"}, {"0010", "1111", "1000"}, {"0001", "1111", "1000"}, {"0100", "1111", "0100"}, {"0010", "1111", "0100"}, {"00111", "11100"}, {"0011", "0110", "1100"}, {"0011", "1110", "1000"}, {"1100", "0111", "0100"}, {"0100", "1110", "0011"}};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < 3; t++) {
			board = new char[6][6];
			for(int i = 0; i < 6; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 6; j++) {
					board[i][j] = st.nextToken().charAt(0);
				}
			}
			
			boolean flag = false;
			
			for(String[] s : cubes) {
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 4; j++) {
						for(int k = 0; k < 6; k++) {
							for(int l = 0; l < 6; l++) {
								if(check(s, k, l)) {
									flag = true;
								}
							}
						}
						s = rotate(s);
					}
					s = mirror(s);
				}
			}
			
			sb.append(flag ? "yes" : "no").append("\n");
		}
		System.out.print(sb);
	}
	
	public static String[] mirror(String[] s) {
		String[] s1 = new String[s.length];
		
		Arrays.fill(s1, "");
		
		for(int i = 0; i < s.length; i++) {
			for(int j = s[i].length() - 1; j >= 0; j--) {
				s1[i] += s[i].charAt(j) + "";
			}
		}
		return s1;
	}
	
	public static String[] rotate(String[] s) {
		String[] s1 = new String[s[0].length()];
		
		Arrays.fill(s1, "");
		
		for(int i = 0; i < s[0].length(); i++) {
			for(int j = s.length - 1; j >= 0; j--) {
				s1[i] += s[j].charAt(i) + "";
			}
		}
		return s1;
	}
	
	public static boolean check(String[] s, int x, int y) {
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				int nx = x + i;
				int ny = y + j;
				
				if(nx < 0 || nx >= 6 || ny < 0 || ny >= 6 || s[i].charAt(j) != board[nx][ny]) {
					return false;
				}
			}
		}
		return true;
	}
}
