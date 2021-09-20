import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int[] alpha = new int[26];
			
			for(char ch : br.readLine().toCharArray()) {
				alpha[ch - 'a']++;
			}
			for(char ch : br.readLine().toCharArray()) {
				alpha[ch - 'a']--;
			}
			
			int answer = 0;
			for(int j = 0; j < alpha.length; j++) {
				if(alpha[j] != 0) {
					answer += Math.abs(alpha[j]);
				}
			}
			sb.append("Case #").append(i).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
