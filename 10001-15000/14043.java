import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int star = 0;
		int[] alphaa = new int[26], alphab = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			alphaa[c - 'a']++;
		}
		for(char c : br.readLine().toCharArray()) {
			if(c == '*') {
				star++;
			}
			else {
				alphab[c - 'a']++;
			}
		}
		
		int count = 0;
		for(int i = 0; i < 26; i++) {
			count += Math.abs(alphaa[i] - alphab[i]);
		}
		
		System.out.print(count == star ? "A" : "N");
	}
}
