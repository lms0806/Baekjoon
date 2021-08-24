import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(), s1 = br.readLine();
		
		int n = 0;
		StringBuilder sb = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(ch == ' ') {
				sb.append(ch);
			}
			else {
				int num = ch - (s1.charAt(n) - 'a') - 1;
				sb.append(num < 'a' ? (char)(num + 26) : (char)(num));
			}
			
			n++;
			
			if(n == s1.length()) {
				n = 0;
			}
		}
		System.out.print(sb);
	}
}
