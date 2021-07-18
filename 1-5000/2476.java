import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int max = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			int num = 0;
			if(a == b) {
				num = b == c ? 10000 + a * 1000 : 1000 + a * 100;
			}
			else if(b == c) {
				num = 1000 + b * 100;
			}
			else if(a == c) {
				num = 1000 + a * 100;
			}
			else {
				num = Math.max(Math.max(a, b), c) * 100;
			}
			
			max = Math.max(max, num);
		}
		System.out.print(max);
	}
}
