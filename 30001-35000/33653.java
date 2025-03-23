import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		br.readLine();
		
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			if(s.length() < str.length()) {
				continue;
			}
			
			for(int i = 0; i <= s.length() - str.length(); i++) {
				if(s.substring(i, i + str.length()).equals(str)) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
