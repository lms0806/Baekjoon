import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char c : br.readLine().toCharArray()) {
			set.add(c);
		}
		
		int idx = 0;
		char[] alpha = new char[26];
		for(char c : set) {
			alpha[idx++] = c;
		}
		
		char ch = 'A';
		while(idx != alpha.length) {
			while(set.contains(ch)) {
				ch++;
			}
			
			alpha[idx++] = ch++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			sb.append(alpha[c - 'A']);
		}
		System.out.print(sb);
	}
}
