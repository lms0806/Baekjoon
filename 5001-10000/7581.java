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
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a == 0) {
				a = d / b / c;
			}
			else if(b == 0) {
				b = d / a / c;
			}
			else if(c == 0) {
				c = d / a/ b;
			}
			else {
				d = a * b * c;
			}
			
			sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
		}
		System.out.print(sb);
	}
}
