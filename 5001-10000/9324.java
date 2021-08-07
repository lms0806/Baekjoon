import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();
			
			int[] alpha = new int[26];
			
			boolean istrue = true;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				
				alpha[ch - 'A']++;
				
				if(alpha[ch - 'A'] % 3 == 0) {
					if((i < s.length() - 1 && s.charAt(i + 1) != ch) || i == s.length() - 1) {
						sb.append("FAKE");
						istrue = false;
						break;
					}
					i++;
				}
			}
			if(istrue) {
				sb.append("OK");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
