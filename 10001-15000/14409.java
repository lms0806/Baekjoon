import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(Math.abs(a - b) > x) {
				answer += Integer.parseInt(br.readLine());
			}
			else {
				answer += Math.max(a, b);
			}
		}
		System.out.print(answer);
	}
}
