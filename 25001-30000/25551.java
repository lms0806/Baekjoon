import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken()), f = Integer.parseInt(st.nextToken());
		
		int x = Math.min(a, Math.min(d, e)), y = Math.min(b, Math.min(c, f));
		
		System.out.print(x == y ? 2 * x : 2 * Math.min(x, y) + 1);
	}
}
