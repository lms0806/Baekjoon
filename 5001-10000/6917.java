import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("quit!")) {
				break;
			}
			
			if(s.length() > 4 && !"aeiou".contains(s.charAt(s.length() - 3) + "") && s.endsWith("or")) {
				sb.append(s.substring(0, s.length() - 1) + "ur");
			}
			else {
				sb.append(s);
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
