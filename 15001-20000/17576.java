import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int t = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a += Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		}
		System.out.print(s.substring(a, a + b));
	}
}
