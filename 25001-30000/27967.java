import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String answer = "";
	static char[] c;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		c = br.readLine().toCharArray();
		
		dfs(0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth) {
		if(depth == c.length) {
			if(check()) {
				answer = new String(c);
			}
			return;
		}
		
		if(c[depth] == 'G') {
			c[depth] = '(';
			dfs(depth + 1);
			c[depth] = ')';
			dfs(depth + 1);
		}
		else {
			dfs(depth + 1);
		}
	}
	
	public static boolean check() {
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '(') {
				count++;
			}
			else {
				count--;
				if(count < 0) {
					return false;
				}
			}
		}
		
		return count != 0 ? false : true;
	}
}
