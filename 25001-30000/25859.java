import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		
		int max = 0;
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
			max = Math.max(max, alpha[c - 'a']);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = max; i > 0; i--) {
			for(int j = 0; j < alpha.length; j++) {
				if(alpha[j] == i) {
					sb.append(((char)(j + 'a') + "").repeat(i));
				}
			}
		}
		System.out.print(sb);
	}
}
