import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int maxx = m / x;
		int maxy = m / y;
		
		int answer = 0;
		for(int i = 0; i <= maxx; i++) {
			for(int j = 0; j <= maxy; j++) {
				if(i * x + j * y > m) {
					break;
				}
				
				answer = Math.max(answer, i * x + y * j);
			}
		}
		System.out.print(answer);
	}
}
