import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			
			if(s.equals("E")) {
				break;
			}
			sb.append("Case ").append(count).append(": ");
			
			if(s.equals(">")) {
				sb.append(a > b ? "true" : "false");
			}
			else if(s.equals(">=")) {
				sb.append(a >= b ? "true" : "false");
			}
			else if(s.equals("<")) {
				sb.append(a < b ? "true" : "false");
			}
			else if(s.equals("<=")) {
				sb.append(a <= b ? "true" : "false");
			}
			else if(s.equals("==")) {
				sb.append(a == b ? "true" : "false");
			}
			else if(s.equals("!=")) {
				sb.append(a != b ? "true" : "false");
			}
			sb.append("\n");
			count++;
		}
		System.out.print(sb);
	}
}
