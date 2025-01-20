import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		char before = s.charAt(0);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == before) {
				sb.append(c);
			}
			else {
				before = c;
			}
		}
		System.out.print(sb);
	}
}
