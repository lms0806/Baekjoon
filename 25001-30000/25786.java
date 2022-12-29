import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(), b = br.readLine();
		int size = Math.max(a.length(), b.length());
		
		a = "0".repeat(size - a.length()) + a;
		b = "0".repeat(size - b.length()) + b;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(solve(a.charAt(i) - '0', b.charAt(i) - '0'));
		}
		System.out.print(sb);
	}
	
	public static int solve(int a, int b) {
		if((a <= 2 && b <= 2) || (a >= 7 && b >= 7)) {
			return 0;
		}
		return 9;
	}
}
