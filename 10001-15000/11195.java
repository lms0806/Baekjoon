import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		int answer = 0;
		for(int i = 0; i < 26; i++) {
			if(alpha[i] != 0 && alpha[i] % 2 == 1) {
				answer++;
			}
		}
		System.out.print(answer < 2 ? 0 : answer - 1);
	}
}
