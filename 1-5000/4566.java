import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("END")) {
				break;
			}
			
			if(str.length() >= 5 && str.charAt(0) == '"' && str.charAt(str.length() / 2) == '"' && str.charAt(str.length() / 2 + 1) == ' ') {
				String s = str.substring(1, str.length() / 2);
				if(!s.contains("\"") && s.equals(str.substring(str.length() / 2 + 2, str.length()))){
					sb.append("Quine(" + s + ")");
				}
				else {
					sb.append("not a quine");
				}
			}
			else {
				sb.append("not a quine");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
