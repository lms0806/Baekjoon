import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		if(c * 2 < a + b) {
			if(x > y) {
				answer += y * c * 2 + Math.min((x - y) * a, (x - y) * c * 2);
			}
			else {
				answer += x * c * 2 + Math.min((y - x) * b, (y - x) * c * 2);
			}
		}
		else {
			answer = a * x + b * y;
		}
		System.out.println(answer);
	}
}
