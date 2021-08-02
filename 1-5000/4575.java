import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("END")) {
				break;
			}
			
			boolean b = true;
			int[] alpha = new int[26];
			for(char ch : s.toCharArray()) {
				if(ch != ' ') {
					alpha[ch - 'A']++;
					
					if(alpha[ch - 'A'] > 1) {
						b = false;
						break;
					}
				}
			}
			if(b) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
}
