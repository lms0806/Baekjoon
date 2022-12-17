import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			for(char c : s.toCharArray()) {
				if(c == 'i') {
					sb.append('e');
				}
				else if(c == 'e') {
					sb.append('i');
				}
				else if(c == 'I') {
					sb.append('E');
				}
				else if(c == 'E') {
					sb.append('I');
				}
				else {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
