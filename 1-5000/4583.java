import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			String answer = "";
			for(int i = s.length() - 1; i >= 0; i--) {
				char ch = s.charAt(i);
				
				if(ch == 'i' || ch == 'o' || ch == 'v' || ch == 'w' || ch == 'x') {
					answer += ch;
				}
				else if(ch == 'b') {
					answer += "d";
				}
				else if(ch == 'd') {
					answer += "b";
				}
				else if(ch == 'p') {
					answer += "q";
				}
				else if(ch == 'q') {
					answer += "p";
				}
				else {
					answer = "INVALID";
					break;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
