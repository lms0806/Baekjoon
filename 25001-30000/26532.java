import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		
		System.out.print(n / (4840 * 5) + (n % (4840 * 5) == 0 ? 0 : 1));
	}
}
