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
			
			int count = 0;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == ':' || ch == '-') {
					if(count > 0 && s.charAt(i-1) != ' ') {
						sb.append(" ");
					}
					sb.append(ch);
					if(i < s.length() - 1 && s.charAt(i+1) != '-' && s.charAt(i+1) != ':' && s.charAt(i+1) != ' ') {
						sb.append(" ");
					}
				}
				else {
					sb.append(ch);
				}
				count++;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
