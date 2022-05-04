import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < 7; j++) {
			String check = br.readLine();
			
			if(check.equals(s)) {
				sb.append("WINNER");
				break;
			}
			else {
				if(j == 6) {
					sb.append("LOSER");
					break;
				}
			}
			for(int i = 0; i < check.length(); i++) {
				if(check.charAt(i) == s.charAt(i)) {
					sb.append("G");
				}
				else if(s.indexOf(check.charAt(i) + "") != -1) {
					sb.append("Y");
				}
				else {
					sb.append("X");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
