import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(i < s.length() - 2 && ch != s.charAt(i + 1) && ch != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2)) {
				sb.append("C");
				i += 2;
			}
			else {
				sb.append(ch == 'R' ? "S" : ch == 'B' ? "K" : "H");
			}
		}
		System.out.print(sb);
	}
}
