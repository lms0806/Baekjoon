import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 1;
		StringBuilder sb = new StringBuilder();
		String str = "";
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			String s = st.nextToken();
			
			sb.append("Case " + count + ": ");
			if(s.contains("b")) {
				char c = (char) (s.charAt(0) - 1);
				if(c < 'A') {
					c = 'G';
				}
				sb.append(c + "# " + st.nextToken());
			}
			else if(s.contains("#")) {
				char c = (char) (s.charAt(0) + 1);
				if(c > 'G') {
					c = 'A';
				}
				sb.append(c + "b " + st.nextToken());
			}
			else {
				sb.append("UNIQUE");
			}
			sb.append("\n");
			count++;
		}
		System.out.print(sb);
	}
}
