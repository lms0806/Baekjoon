import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'A']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alpha[i] == 0) {
				System.out.print((char)(i + 'A'));
				break;
			}
		}
	}
}
