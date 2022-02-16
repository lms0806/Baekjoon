import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] c = br.readLine().toCharArray();
		
		int zero = 0, one = 0;
		
		if(c[0] == '0') {
			zero++;
		}
		else {
			one++;
		}
		
		for(int i = 1; i < c.length; i++) {
			if(c[i] != c[i - 1]) {
				if(c[i] == '0') {
					zero++;
				}
				else {
					one++;
				}
			}
		}
		
		System.out.print(Math.min(zero, one));
	}
}
