import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("ENDOFINPUT")) {
				break;
			}
			
			while(true) {
				s = br.readLine();
				
				if(s.equals("END")) {
					break;
				}
				
				for(char c : s.toCharArray()) {
					if(c >= 'A' && c <= 'Z') {
						c -= 5;
						
						if(c < 'A') {
							c += 26;
						}
					}
					sb.append(c);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
