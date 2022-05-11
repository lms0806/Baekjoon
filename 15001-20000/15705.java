import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String check, temp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		check = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] chs = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			chs[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(chs));
	}
	
	public static int solve(char[][] chs) {
		int n = chs.length, m = chs[0].length, c = check.length();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m - c; j++) {
				temp = "";
				int num = 0;
				for(int k = 0; k < c; k++) {
					temp += chs[i][j + num];
					num++;
				}
				
				if(checks()) {
					return 1;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n - c; j++) {
				temp = "";
				int num = 0;
				for(int k = 0; k < c; k++) {
					temp += chs[j + num][i];
					num++;
				}
				
				if(checks()) {
					return 1;
				}
			}
		}
		
		for(int i = 0; i < n - c; i++) {
			for(int j = 0; j < m - c; j++) {
				temp = "";
				int num = 0;
				for(int k = 0; k < c; k++) {
					temp += chs[i + num][j + num];
					num++;
				}
				
				if(checks()) {
					return 1;
				}
			}
		}
		
		for(int i = c; i < n; i++) {
			for(int j = 0; j < m - c; j++) {
				temp = "";
				int num = 0;
				for(int k = 0; k < c; k++) {
					temp += chs[i - num][j + num];
					num++;
				}
				
				if(checks()) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	public static boolean checks() {
		return temp.equals(check) || new StringBuilder(temp).reverse().toString().equals(check) ? true : false;
	}
}
