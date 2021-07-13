import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int[] alpha = new int[26];
		
		for(int i = 0; i < 26; i++) {
			alpha[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(alpha[str.charAt(i) - 'a'] == -1) {
				alpha[str.charAt(i) - 'a'] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		System.out.print(sb);
	}
}
