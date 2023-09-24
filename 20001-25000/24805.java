import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int sum = 0, answer = 0;
		while(true) {
			answer++;
			
			sum += a;
			
			if(sum >= h) {
				break;
			}
			
			sum -= b;
		}
		System.out.print(answer);
	}
}
