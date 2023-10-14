import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(true) {
			answer += k * Math.min(n, m);
			
			n -= m;
			k -= t;
			
			if(n <= 0 || k <= 0) {
				break;
			}
		}
		System.out.print(answer);
	}
}
