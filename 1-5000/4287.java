import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			
			if(a.equals("#")) {
				break;
			}
			String b = st.nextToken();
			String c = st.nextToken();
			
			String d = "";
			for(int i = 0; i < a.length(); i++) {
				char n = (char)(b.charAt(i) - a.charAt(i) + c.charAt(i));
				
				if(n >= 'z') {
					n -= 26;
				}
				if(n < 'a') {
					n += 26;
				}
				
				d += n;
			}
			sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
		}
		System.out.print(sb);
	}
}
