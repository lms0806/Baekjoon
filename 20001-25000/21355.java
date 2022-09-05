import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String answer = "";
		if(s.contains("+")) {
			if(Integer.parseInt(s.substring(0, 2)) < 20) {
				answer = "19" + s;
			}
			else {
				answer = "18" + s;
			}
		}
		else {
			if(Integer.parseInt(s.substring(0, 2)) <= 20) {
				answer = "20" + s;
			}
			else {
				answer = "19" + s;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : answer.toCharArray()) {
			if(c == '+' || c == '-') {
				continue;
			}
			sb.append(c);
		}
		System.out.print(sb);
	}
}
