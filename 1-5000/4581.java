import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int y = 0, n = 0, a = 0;
			for(char ch : s.toCharArray()) {
				if(ch == 'Y') {
					y++;
				}
				else if(ch == 'N') {
					n++;
				}
				else if(ch == 'A') {
					a++;
				}
			}
			
			int size = s.length() / 2 + (s.length() % 2 == 1 ? 1 : 0);
			
			if(a >= size) {
				sb.append("need quorum");
			}
			else {
				sb.append(y > n ? "yes" : y < n ? "no" : "tie");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
