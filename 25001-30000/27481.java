import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		br.readLine();
		
		char[] ch = new char[10];
		
		Arrays.fill(ch, '0');
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'L') {
				for(int i = 0; i < 10; i++) {
					if(ch[i] == '0') {
						ch[i] = '1';
						break;
					}
				}
			}
			else if(c == 'R') {
				for(int i = 9; i >= 0; i--) {
					if(ch[i] == '0') {
						ch[i] = '1';
						break;
					}
				}
			}
			else {
				ch[c - '0'] = '0';
			}
		}
		
		System.out.print(new String(ch));
	}
}
