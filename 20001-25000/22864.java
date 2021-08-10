import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 0, p = 0, answer = 0;
		while(count != 24) {
			if(p + a <= m) {
				answer += b;
				p += a;
			}
			else {
				p = p - c < 0 ? 0 : p - c;
			}
			count++;
		}
		System.out.print(answer);
	}
}
