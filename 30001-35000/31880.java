import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		long answer = 0;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			answer += Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			long num = Long.parseLong(st.nextToken());
			
			if(num > 0) {
				answer *= num;
			}
		}
		System.out.print(answer);
	}
}
