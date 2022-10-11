import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[] ch = br.readLine().toCharArray();
		
		int a = 0, b = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'U') {
				a = i;
				break;
			}
		}
		
		for(int i = ch.length - 1; i >= 0; i--) {
			if(ch[i] == 'F') {
				b = i;
				break;
			}
		}
		
		for(int i = 0; i < a; i++) {
			ch[i] = '-';
		}
		for(int i = a + 1; i < b; i++) {
			ch[i] = 'C';
		}
		for(int i = b + 1; i < ch.length; i++) {
			ch[i] = '-';
		}
		System.out.print(new String(ch));
	}
}
