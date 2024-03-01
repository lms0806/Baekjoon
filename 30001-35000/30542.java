import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toLowerCase().replaceAll("[^a-z]", "");
		
		StringBuilder sb = new StringBuilder();
		if(s.length() < 2) {
			sb.append("Palindrome");
		}
		else {
			for(int i = 0; i <= s.length(); i++) {
				for(int j = 0; j <= i - 2; j++) {
					String str = s.substring(j, i);
					
					if(str.equals(new StringBuilder(str).reverse().toString())){
						sb.append("Palindrome");
						break;
					}
				}
				
				if(sb.length() != 0) {
					break;
				}
			}
		}
		
		System.out.print(sb.length() == 0 ? "Anti-palindrome" : sb);
	}
}
