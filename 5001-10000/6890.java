import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				c += ch[idx] - 'A';
				
				if(c > 'Z') {
					c -= 26;
				}
				
				sb.append(c);
				idx++;
				
				if(idx >= ch.length) {
					idx = 0;
				}
			}
		}
		System.out.print(sb);
	}
}
