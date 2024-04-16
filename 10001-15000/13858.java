import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		while(k --> 0) {
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < s.length(); i += 2) {
				for(int j = s.charAt(i) - '0'; j > 0; j--) {
					sb.append(s.charAt(i + 1));
				}
			}
			
			s = sb.toString();
		}
		System.out.print(s.charAt(p));
	}
}
