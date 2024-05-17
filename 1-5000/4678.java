import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			long answer = 0;
			for(int i = 0; i < s.length(); i++) {
				answer += (s.charAt(i) - '0') * ((1 << s.length() - i) - 1);
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
