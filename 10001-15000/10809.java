import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		
		Arrays.fill(alpha, -1);
		
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i) - 'a';
			if(alpha[ch] == -1) {
				alpha[ch] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : alpha) {
			sb.append(n).append(" ");
		}
		System.out.print(sb);
	}
}
