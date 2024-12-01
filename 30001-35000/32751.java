import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(br.readLine().toCharArray(), a, b, c, d) ? "Yes" : "No");
	}
	
	public static boolean solve(char[] ch, int a, int b, int c, int d) {
		if(ch[0] != 'a' || ch[ch.length - 1] != 'a') {
			return false;
		}
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'a') {
				if(a == 0) {
					return false;
				}
				a--;
			}
			else if(ch[i] == 'b') {
				if(b == 0) {
					return false;
				}
				b--;
			}
			else if(ch[i] == 'c') {
				if(c == 0) {
					return false;
				}
				c--;
			}
			else if(ch[i] == 'd') {
				if(d == 0) {
					return false;
				}
				d--;
			}
			
			if(i > 0 && ch[i] == ch[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
