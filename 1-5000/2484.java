import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		int max = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
			int num = 0;
			if(a == b && b == c && c == d) {
				num = 50000 + a * 5000;
			}
			else if((a == b && b == c) || (a == b && b == d) || (a == c && c == d)) {
				num = 10000 + a * 1000;
			}
			else if(b == c && c == d) {
				num = 10000 + b * 1000;
			}
			else if((a == b && c == d) || (a == c && b == d)) {
				num = 2000 + a * 500 + d * 500;
			}
			else if(a == d && b == c) {
				num = 2000 + a * 500 + b * 500;
			}
			else if(a == b || a == c || a == d) {
				num = 1000 + a * 100;
			}
			else if(b == c || b == d) {
				num = 1000 + b * 100;
			}
			else if(c == d) {
				num = 1000 + c * 100;
			}
			else {
				num = Math.max(Math.max(a, b), Math.max(c, d)) * 100;
			}
			
			max = Math.max(max, num);
		}
		System.out.print(max);
	}
}
