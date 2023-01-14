import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean a = false, b = false, c = false;
		
		int answer = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 0) {
				a = true;
			}
			else if(num == 1) {
				b = true;
				if(a) {
					c = true;
					answer = Math.max(answer, 2);
				}
			}
			else {
				if(c) {
					answer = 3;
				}
				if(a || b) {
					answer = Math.max(answer, 2);
				}
			}
		}
		System.out.print(answer);
	}
}
