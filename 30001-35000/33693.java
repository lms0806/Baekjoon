import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int answer = 0, count = 0;
			StringBuilder print = new StringBuilder();
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if(c == 'C') {
					if(s.length() - i == count) {
						print.append(')');
						answer += 2;
						count--;
					}
					else {
						print.append('(');
						count++;
					}
				}
				else {
					answer++;
					if(count == 0) {
						print.append('(');
						count++;
					}
					else {
						count--;
						print.append(')');
					}
				}
			}
			sb.append(answer).append("\n").append(print).append("\n");
		}
		System.out.print(sb);
	}
}
