import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = br.readLine();
			if(a.equals("END")) {
				break;
			}
			String b = br.readLine();
			
			int[] alpha = new int[26];
			
			for(char ch : a.toCharArray()) {
				alpha[ch - 'a']++;
			}
			for(char ch : b.toCharArray()) {
				alpha[ch - 'a']--;
			}
			
			sb.append("Case ").append(count).append(": ");
			int i = 0;
			for(;i < alpha.length; i++) {
				if(alpha[i] != 0) {
					sb.append("different");
					break;
				}
			}
			if(i == 26) {
				sb.append("same");
			}
			sb.append("\n");
			
			count++;
		}
		System.out.print(sb);
	}
}
