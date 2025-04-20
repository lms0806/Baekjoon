import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int s = x - r, e = x + r;
		
		int a = 0, b = 0;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(s < num && num < e) {
				a++;
			}
			else if(num == s || num == e) {
				b++;
			}
		}
		System.out.print(a + " " + b);
	}
}
