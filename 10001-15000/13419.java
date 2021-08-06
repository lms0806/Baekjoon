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
			
			if(s.length() == 1) {
				sb.append(s).append("\n").append(s);
			}
			else {
				if(s.length() % 2 == 1) {
					s += s;
				}
				for(int i = 0; i < s.length(); i+=2) {
					sb.append(s.charAt(i));
				}
				sb.append("\n");
				for(int i = 1; i < s.length(); i+=2) {
					sb.append(s.charAt(i));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
