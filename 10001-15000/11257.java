import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			sb.append(s).append(" ").append(a + b + c).append(" ");
			if(a + b + c >= 55 && (double)a >= 10.5 && (double)b >= 7.5 && (double)c >= 12) {
				sb.append("PASS");
			}
			else {
				sb.append("FAIL");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
