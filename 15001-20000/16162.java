import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int answer = 0, num = a;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int now = Integer.parseInt(st.nextToken());
			
			if(now == num) {
				num += d;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
