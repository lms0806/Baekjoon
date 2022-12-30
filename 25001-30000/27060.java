import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		int max = 0;
		for(int i = 0; i < 4; i++) {
			for(char c : br.readLine().toCharArray()) {
				if(c >= 'A' && c <= 'Z') {
					alpha[c - 'A']++;
					max = Math.max(max, alpha[c - 'A']);
				}
			}
		}
		
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < max; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < alpha.length; j++) {
				if(max - i <= alpha[j]) {
					sb.append("* ");
				}
				else {
					sb.append("  ");
				}
			}
			answer.append(sb.toString().stripTrailing()).append("\n");
		}
		
		for(int i = 0; i < 26; i++) {
			answer.append((char)(i + 'A')).append(" ");
		}
		System.out.print(answer);
		
	}
}
