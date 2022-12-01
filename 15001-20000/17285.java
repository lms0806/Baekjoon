import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int key = 0;
		while(true) {
			char c = (char)(s.charAt(0) ^ key);
			
			if(c == 'C') {
				break;
			}
			
			key++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			sb.append((char)(c ^ key));
		}
		System.out.print(sb);
	}
}
