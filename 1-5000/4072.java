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
				
				for(int i = s.length()-1; i >= 0; i--) {
					sb.append(s.charAt(i));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
