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
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			if(a == 0) {
				break;
			}
			
			int e, f, g, h;
			int answer = 0;
			while(true) {
				if(a == b && b == c && c == d) {
					break;
				}
				
				e = Math.abs(a - b);
				f = Math.abs(b - c);
				g = Math.abs(c - d);
				h = Math.abs(d - a);
				
				a = e;
				b = f;
				c = g;
				d = h;
				
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
