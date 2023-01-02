import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				c -= n;
				n++;
				
				if(n == 26) {
					n = 1;
				}
				if(c < 'a') {
					c += 26;
				}
			}
			sb.append(c);
		}
		System.out.print(sb);
	}
}
