import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] s = new String[10][10];
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 10; j++) {
				s[i][j] = st.nextToken();
			}
		}
		
		System.out.print(solve(s));
	}
	
	public static int solve(String[][] s) {
		for(int i = 0; i < 10; i++) {
			boolean a = true, b = true;
			for(int j = 1; j < 10; j++) {
				if(a && !s[i][j].equals(s[i][j - 1])) {
					a = false;
				}
				if(b && !s[j][i].equals(s[j - 1][i])) {
					b = false;
				}
			}
			
			if(a || b) {
				return 1;
			}
		}
		return 0;
	}
}
