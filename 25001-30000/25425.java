import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		long a = Long.parseLong(st.nextToken()) - Long.parseLong(st.nextToken());
		
		System.out.print(Math.min(n, a + 1) + " " + Math.min(a / m + (a % m == 0 ? 1 : 2), n));
	}
}
