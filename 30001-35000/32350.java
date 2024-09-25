import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int answer = 0, na = 0;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(na != 0) {
				num += na;
				na = 0;
			}
			
			if(num > 0) {
				while(num > 0) {
					num -= d;
					answer++;
				}
				
				if(num < 0) {
					na = num * p / 100;
				}
			}
		}
		System.out.print(answer);
	}
}
