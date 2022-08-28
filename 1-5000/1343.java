import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c == 'X') {
				count++;
			}
			else {
				changealpha(count);
				if(count % 2 == 1) {
					return "-1";
				}
				count = 0;
				sb.append(".");
			}
		}
		changealpha(count);
		return count % 2 == 1 ? "-1" : sb.toString();
	}
	
	public static void changealpha(int n) {
		while(true) {
			if(n < 4) {
				if(n == 2) {
					sb.append("BB");
				}
				break;
			}
			sb.append("AAAA");
			n -= 4;
		}
	}
}
