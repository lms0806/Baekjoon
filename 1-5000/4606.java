import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		while(!str.equals("#")) {
			
			for(char ch : str.toCharArray()) {
				if(ch == ' ') {
					sb.append("%20");
				}
				else if(ch == '!') {
					sb.append("%21");
				}
				else if(ch == '$') {
					sb.append("%24");
				}
				else if(ch == '%') {
					sb.append("%25");
				}
				else if(ch == '(') {
					sb.append("%28");
				}
				else if(ch == ')') {
					sb.append("%29");
				}
				else if(ch == '*') {
					sb.append("%2a");
				}
				else {
					sb.append(ch);
				}
			}
			sb.append("\n");
			
			str = br.readLine();
		}
		System.out.print(sb);
	}
}
