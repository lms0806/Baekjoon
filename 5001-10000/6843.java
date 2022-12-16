import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			if(c != ' ') {
				alpha[c - 'A']++;
			}
		}
		for(char c : br.readLine().toCharArray()) {
			if(c != ' ') {
				alpha[c - 'A']--;
			}
		}
		
		System.out.print(print(alpha));
	}
	
	public static String print(int[] alpha) {
		for(int a : alpha) {
			if(a != 0) {
				return "Is not an anagram.";
			}
		}
		return "Is an anagram.";
	}
}
