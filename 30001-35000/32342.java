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
			
			int answer = 0;
			for(int i = 0; i < s.length() - 2; i++) {
				if(s.charAt(i) == 'W' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'W') {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
