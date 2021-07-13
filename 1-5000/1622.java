import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			String str1 = br.readLine();
			
			int[] alpha = new int[26];
			int[] alpha1 = new int[26];
			
			for(char ch : str.toCharArray()) {
				alpha[ch - 'a']++;
			}
			for(char ch : str1.toCharArray()) {
				alpha1[ch - 'a']++;
			}
			
			for(int i = 0; i < 26; i++) {
				int count = Math.min(alpha[i], alpha1[i]);
				while(count --> 0) {
					sb.append((char)(i + 'a'));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
