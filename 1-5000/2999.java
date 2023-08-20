import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int r = 1, c = 1;
		boolean flag = false;
		for(r = s.length(); r > 0; r--) {
			for(c = 1; c <= s.length(); c++) {
				if(r <= c && r * c == s.length()) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < s.length(); j += r) {
				sb.append(s.charAt(i + j));
			}
		}
		System.out.print(sb);
	}
} 
