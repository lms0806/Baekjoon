import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 100 - Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append(print(n, 25));
		n %= 25;
		sb.append(print(n, 10));
		n %= 10;
		sb.append(print(n, 5));
		n %= 5;
		sb.append(print(n, 1));
		System.out.print(sb);
	}
	
	public static String print(int n, int a) {
		return n / a + " ";
	}
}
