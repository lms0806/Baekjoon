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
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a == 0) {
				sb.append(c / b).append(" ").append(b).append(" ").append(c);
			}
			else if(b == 0) {
				sb.append(a).append(" ").append(c / a).append(" ").append(c);
			}
			else {
				sb.append(a).append(" ").append(b).append(" ").append(a * b);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
