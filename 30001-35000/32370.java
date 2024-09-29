import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		if((a == x && b > y) || (a > x && b == y)) {
			answer += 3;
		}
		else {
			if(a != 0) {
				answer++;
			}
			if(b != 0) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
