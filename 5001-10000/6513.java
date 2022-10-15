import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			String s = br.readLine();
			
			if(map.containsKey(s)) {
				sb.append(map.get(s));
			}
			else {
				char c = s.charAt(s.length() - 2);
				char ch = s.charAt(s.length() - 1);
				if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && ch == 'y') {
					sb.append(s.subSequence(0, s.length() - 1)).append("ies");
				}
				else {
					sb.append(s);
					if(ch == 'o' || ch == 's' || ch == 'x' || s.endsWith("ch") || s.endsWith("sh")) {
						sb.append("es");
					}
					else {
						sb.append("s");
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
