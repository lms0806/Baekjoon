import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(i % x == 0) {
				sb.append(i % y == 0 ? "FizzBuzz" : "Fizz");
			}
			else {
				sb.append(i % y == 0 ? "Buzz" : i);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
