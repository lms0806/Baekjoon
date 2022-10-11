import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] alpha = new int[30][26];
		
		int t = Integer.parseInt(br.readLine());
		
		int[] max = new int[30];
		while(t --> 0) {
			String s = br.readLine();
			
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				alpha[i][c - 'a']++;
				
				max[i] = Math.max(max[i], alpha[i][c - 'a']);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 30; i++) {
			if(max[i] == 0) {
				break;
			}
			
			sb.append(i + 1).append(": ");
			for(int j = 0; j < 26; j++) {
				if(alpha[i][j] == max[i]) {
					sb.append((char)(j + 'a')).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
