import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(true) {
			if(n - m > 0) {
				answer += Math.min(a, b * m);
				answer += m;
				n -= m;
			}
			else {
				answer += Math.min(a, b * n);
				answer += n;
				break;
			}
		}
		System.out.print(answer);
	}
}
