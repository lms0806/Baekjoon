import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char c = st.nextToken().charAt(0);
		String s = st.nextToken();
		
		StringBuilder sb = new StringBuilder();
		if(c == 'E') {
			char ch = s.charAt(0);
			int count = 1;
			for(int i = 1; i < s.length(); i++) {
				if(ch == s.charAt(i)) {
					count++;
				}
				else {
					sb.append(ch).append(count);
					ch = s.charAt(i);
					count = 1;
				}
			}
			sb.append(ch).append(count);
		}
		else {
			for(int i = 0; i < s.length(); i += 2) {
				sb.append((s.charAt(i) + "").repeat(s.charAt(i + 1) - '0'));
			}
		}
		System.out.print(sb);
	}
}
