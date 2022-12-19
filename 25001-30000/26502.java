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
			
			for(char c : s.toCharArray()) {
				if(c >= 'A' && c <= 'Z') {
					if(c == 'Y') {
						sb.append('A');
					}
					else if(c == 'A') {
						sb.append('E');
					}
					else if(c == 'E') {
						sb.append('I');
					}
					else if(c == 'I') {
						sb.append('O');
					}
					else if(c == 'O') {
						sb.append('U');
					}
					else if(c == 'U') {
						sb.append('Y');
					}
					else {
						sb.append(c);
					}
				}
				else if(c >= 'a' && c <= 'z') {
					if(c == 'y') {
						sb.append('a');
					}
					else if(c == 'a') {
						sb.append('e');
					}
					else if(c == 'e') {
						sb.append('i');
					}
					else if(c == 'i') {
						sb.append('o');
					}
					else if(c == 'o') {
						sb.append('u');
					}
					else if(c == 'u') {
						sb.append('y');
					}
					else {
						sb.append(c);
					}
				}
				else {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
