import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int t = 0, b = Integer.MAX_VALUE;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			t = Math.max(t, Integer.parseInt(st.nextToken()));
			b = Math.min(b, Integer.parseInt(st.nextToken()));
		}
		
		System.out.print((t * b) % 7 + 1);
	}
}
