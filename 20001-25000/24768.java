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
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a + b == 13) {
				sb.append("Never speak again.");
			}
			else if(a < b) {
				sb.append("Left beehind.");
			}
			else if(a == b) {
				sb.append("Undecided.");
			}
			else {
				sb.append("To the convention.");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
