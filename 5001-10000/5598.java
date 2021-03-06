import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			ch = (char)(ch - 3);
			
			if(ch < 'A') {
				ch = (char)(ch + 26);
			}
			sb.append(ch);
		}
		System.out.print(sb);
	}
}
