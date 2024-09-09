import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long t = Long.parseLong(st.nextToken()), s = Long.parseLong(st.nextToken());
		
		long zip = n + (n - 1) / 8 * s;
		long dok = t + m + (m - 1) / 8 * (2 * t + s);
		
		System.out.print(zip < dok ? "Zip\n" + zip : "Dok\n" + dok);
	}
}
