import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int a = 0, b = 0, c = 0, d = 0;
		for(char ch : s.toCharArray()) {
			if(ch == '2') {
				a++;
			}
			else if(ch == '0') {
				b++;
			}
			else if(ch == '1') {
				c++;
			}
			else if(ch == '8') {
				d++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(a + b + c + d == s.length()) {
			if(a != 0 && b != 0 && c != 0 && d != 0) {
				sb.append(a == b && b == c && c == d ? 8 : 2);
			}
			else {
				sb.append(1);
			}
		}
		else {
			sb.append(0);
		}
		System.out.print(sb);
	}
}
