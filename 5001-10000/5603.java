import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine() + " ";
		
		while(n --> 0) {
			StringBuilder sb = new StringBuilder();
			
			int count = 1;
			char ch = s.charAt(0);
			for(int i = 1; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if(c != ch) {
					sb.append(count).append(ch);
					ch = c;
					count = 0;
				}
				count++;
			}
			sb.append(" ");
			s = sb.toString();
		}
		System.out.print(s);
	}
}
