import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[][] c = new char[3][3];
		for(int i = 0; i < 3; i++) {
			c[i] = br.readLine().toCharArray();
		}
		System.out.print(solve(c));
	}
	
	public static String solve(char[][] c) {
		for(int i = 0; i < 3; i++) {
			if(c[i][0] == c[i][1] && c[i][1] == c[i][2] && c[i][0] != '.') {
				return "YES";
			}
			if(c[0][i] == c[1][i] && c[1][i] == c[2][i] && c[0][i] != '.') {
				return "YES";
			}
		}
		
		if(c[1][1] != '.' && ((c[0][0] == c[1][1] && c[1][1] == c[2][2]) || (c[0][2] == c[1][1] && c[1][1] == c[2][0]))) {
			return "YES";
		}
		
		return "NO";
	}
}
