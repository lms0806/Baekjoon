import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0;
		while(t --> 0) {
			char[] c = br.readLine().toCharArray();
			char[] ch = c.clone();
			
			for(int i = 0; i < c.length; i++) {
				if(c[i] == 'i') {
					ch[i] = 'j';
				}
				else if(c[i] == 'p' || c[i] == 'b') {
					ch[i] = 'd';
				}
			}

			if(solve(c)) {
				a++;
				b++;
			}
			else if(solve(ch)){
				b++;
			}			
		}
		System.out.print(a + "\n" + b);
	}
	
	public static boolean solve(char[] c) {
		for(int i = 1; i < c.length; i++) {
			if(c[i] == c[i - 1] || (i > 1 && c[i] == c[i - 2])) {
				return true;
			}
		}
		return false;
	}
}
