import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[26], b = new int[26];
		for(char c : br.readLine().toCharArray()) {
			a[c - 'a']++;
		}
		for(char c : br.readLine().toCharArray()) {
			b[c - 'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < Math.max(a[i], b[i]); j++) {
				sb.append((char)(i + 'a'));
			}
		}
		System.out.print(sb);
	}
}
