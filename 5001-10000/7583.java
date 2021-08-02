import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("#")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				if(s.length() > 1) {
					sb.append(s.charAt(0));
					for(int i = s.length() - 2; i > 0; i--) {
						sb.append(s.charAt(i));
					}
					sb.append(s.charAt(s.length() - 1));
				}
				else {
					sb.append(s);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
