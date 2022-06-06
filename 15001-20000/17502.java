import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		char[] ch = br.readLine().toCharArray();
		
		for(int i = 0; i < ch.length / 2 + 1; i++) {
			if(ch[i] == '?') {
				if(ch[ch.length - i - 1] == '?') {
					ch[i] = 'a';
					ch[ch.length - i - 1] = 'a';
				}
				else {
					ch[i] = ch[ch.length - i - 1];
				}
			}
			else {
				if(ch[ch.length - i - 1] == '?') {
					ch[ch.length - i - 1] = ch[i];
				}
			}
		}
		
		System.out.print(ch);
	}
}
