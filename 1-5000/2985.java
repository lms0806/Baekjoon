import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		if(a + b == c || a * b == c || a - b == c || a / b == c) {
			if(a + b == c) {
				sb.append("+");
			}
			else if(a * b == c) {
				sb.append("*");
			}
			else if(a - b == c) {
				sb.append("-");
			}
			else {
				sb.append("/");
			}
			sb.append(b).append("=");
		}
		else {
			sb.append("=").append(b);
			if(a == b + c) {
				sb.append("+");
			}
			else if(a == b * c) {
				sb.append("*");
			}
			else if(a == b - c) {
				sb.append("-");
			}
			else {
				sb.append("/");
			}
		}
		sb.append(c);
		System.out.print(sb);
	}
}
