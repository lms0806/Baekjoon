import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			if(s.charAt(0) >= '5') {
				sb.append((long)(5 * Math.pow(10, s.length() - 1) * (5 * Math.pow(10, s.length() - 1) - 1)));
			}
			else {
				long answer = 0;
				for(int i = 0; i < s.length(); i++) {
					answer += (9 - ((long)s.charAt(i) - '0')) * Math.pow(10, s.length() - i - 1);
				}
				sb.append(answer * Long.parseLong(s));
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
