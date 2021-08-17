import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		String answer = "", str = "";
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				
				if(s.equals("<br>")) {
					sb.append(answer.trim()).append("\n");
					answer = "";
				}
				else if(s.equals("<hr>")) {
					if(answer.length() != 0) {
						sb.append(answer.trim()).append("\n");
						answer = "";
					}
					sb.append("-".repeat(80)).append("\n");
				}
				else {
					if((answer + s).length() > 80) {
						sb.append(answer.trim()).append("\n");
						answer = "";
					}
					answer += s + " ";
				}
			}
		}
		System.out.print(sb + answer.trim());
	}
}
