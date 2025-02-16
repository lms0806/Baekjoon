import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int a = 0, b = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) { 
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = Math.max(Integer.parseInt(st.nextToken()), a);
			b = Math.min(Integer.parseInt(st.nextToken()), b);
		}
		
		System.out.print(a > b ? "bad news" : (b - a + 1) + " " + a);
	}
}
