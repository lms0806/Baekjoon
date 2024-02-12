import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			for(char c : br.readLine().toCharArray()) {
				c += 13;
				
				if(c > 'z') {
					c -= 26;
				}
				
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
