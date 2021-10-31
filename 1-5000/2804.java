import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int x, y;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken(), b = st.nextToken();
		
		input(a, b);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < b.length(); i++) {
			if(i == y) {
				sb.append(a);
			}
			else {
				for(int j = 0; j < a.length(); j++) {
					sb.append(j == x ? b.charAt(i) : ".");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void input(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) {
					x = i;
					y = j;
					return;
				}
			}
		}
	}
}
