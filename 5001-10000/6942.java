import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = m; i <= n; i++) {
			String s = String.valueOf(i);
			
			StringBuilder sb = new StringBuilder();
			for(char c : s.toCharArray()) {
				if(c == '0' || c == '1' || c == '8') {
					sb.append(c);
				}
				else if(c == '6') {
					sb.append('9');
				}
				else if(c == '9') {
					sb.append('6');
				}
				else {
					break;
				}
			}
			
			if(s.equals(sb.reverse().toString())) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
