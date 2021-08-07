import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder(), ss = new StringBuilder();
		
		boolean istrue = false;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == '<' || ch == ' ') {
				sb.append(ss.reverse());
				ss.setLength(0);
				sb.append(ch);
				if(ch == '<') {
					istrue = true;
				}
			}
			else if(ch == '>') {
				istrue = false;
				sb.append(ch);
			}
			else {
				if(istrue) {
					sb.append(ch);
				}
				else {
					ss.append(ch);
				}
			}
		}
		if(ss.length() != 0) {
			sb.append(ss.reverse());
		}
		
		System.out.print(sb);
	}
}
