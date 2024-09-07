import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		char[][] ch = new char[2][];
		ch[0] = s.substring(0, s.length() / 2).toCharArray();
		ch[1] = s.substring(s.length() / 2).toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			int sum = 0;
			for(int j = 0; j < ch[i].length; j++) {
				sum += ch[i][j] - 'A';
			}
			
			sum %= 26;
			
			for(int j = 0; j < ch[i].length; j++) {
				ch[i][j] += sum;
				
				while(ch[i][j] > 'Z') {
					ch[i][j] -= 26;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < ch[0].length; i++) {
			char c = (char) (ch[0][i] + ch[1][i] - 'A');
			
			while(c > 'Z') {
				c -= 26;
			}
			sb.append(c);
		}
		System.out.print(sb);
	}
}
