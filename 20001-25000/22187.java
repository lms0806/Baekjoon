import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String s = br.readLine();
		
		StringBuilder answer = new StringBuilder(), sb = new StringBuilder();
		boolean flag = false;
		for(char c : s.toCharArray()) {
			if(c == '(') {
				flag = true;
			}
			else if(c == ')') {
				flag = false;
				answer.append(sb.reverse());
				sb.setLength(0);
			}
			else {
				if(flag) {
					sb.append(c);
				}
				else {
					answer.append(c);
				}
			}
		}
		System.out.print(answer);
	}
}
