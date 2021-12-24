import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String s = br.readLine();
			
			if(n < 12) {
				sb.append("invalid");
			}
			else {
				if(!s.matches(".*[a-z].*") || !s.matches(".*[A-Z].*") || !s.matches(".*[0-9].*") || !s.matches(".*[+_)(*&^%$#@!./,;{}].*")) {
					sb.append("invalid");
				}
				else {
					sb.append("valid");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
