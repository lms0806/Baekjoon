import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long t = Long.parseLong(st.nextToken()) % 3;
		
		String s = br.readLine();
		
		while(t --> 0) {
			s = s.substring(0, n / 4) + s.substring(n / 4 * 3) + s.substring(n / 4, n / 4 * 3);
		}
		System.out.print(s);
	}
}
