import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.print(-32768 <= n && n <= 32767 ? "short" : -2147483648 <= n && n <= 2147483647 ? "int" : "long long");
	}
}
