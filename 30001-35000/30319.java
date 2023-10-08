import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine().split("-")) ? "GOOD" : "TOO LATE");
	}
	
	public static boolean solve(String[] s) {
		int m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]);
		
		return m <= 8 || (m == 9 && d < 17) ? true : false;
	}
}
