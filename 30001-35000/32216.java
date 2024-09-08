import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int d = Integer.parseInt(st.nextToken());
			
			if(t > k) {
				t = t + d - Math.abs(t - k);
			}
			else if(t < k) {
				t = t + d + Math.abs(t - k);
			}
			else {
				t += d;
			}
			
			answer += Math.abs(t - k);
		}
		System.out.print(answer);
	}
}
