import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(), b = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length(); i++) {
			sb.append((char)Math.max(a.charAt(i), b.charAt(i)));
		}
		System.out.print(sb);
	}
}
