import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int solve(int a, int b) {
		int c = (a + b) % 10, d = (b + c) % 10, count = 4;
		
		if(c == a && d == b) {
			return count;
		}
		while(true) {
			count++;
			int temp = (c + d) % 10;
			c = d;
			d = temp;
			
			if(c == a && d == b) {
				return count;
			}
		}
	}
}
