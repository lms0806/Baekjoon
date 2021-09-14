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
			String s = st.nextToken();
			
			if(s.equals("#")) {
				break;
			}
			
			int y = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			if(y > 31 || y > 30 && m > 4) {
				s = "?";
				y -= 30;
			}
			
			sb.append(s).append(" ").append(y).append(" ").append(m).append(" ").append(d).append("\n");
		}
		System.out.print(sb);
	}
}
