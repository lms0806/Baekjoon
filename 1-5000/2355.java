import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());

		System.out.print((a + b) * (Math.max(a, b) - Math.min(a, b) + 1) / 2);
	}
}
