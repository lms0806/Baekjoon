import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < ch.length; j++) {
				sb.append(ch[j]);
				
				ch[j]--;
				
				if(ch[j] < 'A') {
					ch[j] += 26;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
