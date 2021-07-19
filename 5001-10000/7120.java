import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char c = '1';
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			if(c != ch) {
				sb.append(ch);
				c = ch;
			}
		}
		System.out.print(sb);
	}
}
