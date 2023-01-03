import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				alpha[c - 'A']++;
			}
			else if(c >= 'a' && c <= 'z') {
				alpha[c - 'a']++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			sb.append((char)(i + 'A')).append(" | ").append("*".repeat(alpha[i])).append("\n");
		}
		System.out.print(sb);
	}
}
