import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			char c = s.charAt(s.length() - 1);
			StringBuilder sb = new StringBuilder(c + "");
			for(int i = s.length() - 2; i >= 0; i--) {
				if(s.charAt(i) > c) {
					sb.append(s.charAt(i));
					c = s.charAt(i);
				}
				else {
					break;
				}
			}
			
			answer.append("The longest decreasing suffix of ").append(s).append(" is ").append(sb.reverse()).append("\n");
		}
		System.out.print(answer);
	}
}
