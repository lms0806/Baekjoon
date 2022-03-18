import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		long before = 1;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			char c = st.nextToken().charAt(0);
			long b = Long.parseLong(st.nextToken());
			
			long n = 0;
			if(c == '+') {
				n = a + b - before;
			}
			else if(c == '-') {
				n = (a - b) * before;
			}
			else if(c == '*') {
				n = (long) Math.pow(a * b, 2);
			}
			else {
				n = a % 2 == 0 ? a / 2 : (a + 1) / 2;
			}
			
			sb.append(n).append("\n");
			before = n;
		}
		System.out.print(sb);
	}
}
