import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(true) {
			if(a > b) {
				b += y;
			}
			else if(a < b) {
				a += x;
			}
			else {
				answer = a;
				break;
			}
			
			if(a > 10000 || b > 10000) {
				answer = -1;
				break;
			}
		}
		System.out.print(answer);
	}
}
