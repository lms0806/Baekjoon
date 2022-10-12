import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int a, int b) {
		while(true) {
			b += a;
			if(b >= 5) {
				return "yt";
			}
			a += b;
			if(a >= 5) {
				return "yj";
			}
		}
	}
}
