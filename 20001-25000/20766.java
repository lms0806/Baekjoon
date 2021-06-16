import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();
			
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == ':' || ch == '-') {
					if(i > 0 && sb.charAt(sb.length()-1) != ' ') {
						sb.append(" ");
					}
					sb.append(ch);
					if(i < s.length() - 1 && s.charAt(i+1) != ' ') {
						sb.append(" ");
					}
				}
				else {
					sb.append(ch);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
