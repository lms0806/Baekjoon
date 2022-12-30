import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s = br.readLine();
			
			char[] alpha = s.toCharArray();
			char[] alpha1 = s.toUpperCase().toCharArray();
			
			StringBuilder sb = new StringBuilder();
			for(char c : br.readLine().toCharArray()) {
				if(c >= 'a' && c <= 'z') {
					sb.append(alpha[c - 'a']);
				}
				else if(c >= 'A' && c <= 'Z'){
					sb.append(alpha1[c - 'A']);
				}
				else {
					sb.append(c);
				}
			}
			System.out.print(sb);
		}
		catch(Exception e) {
			
		}
	}
}
