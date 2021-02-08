import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = 1, b = 1, c = 1;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			int tmp = 0;
			if(a > b && a > c) {
				tmp = c;
				c = a;
				a = tmp;
			}
			else {
				if(b > c) {
					tmp = c;
					c = b;
					b = tmp;
				}
			}
			
			if(c*c == (a*a) + (b*b)) {
				sb.append("right").append("\n");
			}
			else {
				sb.append("wrong").append("\n");
			}
		}
		System.out.print(sb);
	}
}
