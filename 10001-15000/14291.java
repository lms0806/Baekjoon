import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			
			sb.append("Case #").append(t).append(": ").append(solve(s, b) - solve(s, a) + (s.charAt((int) ((a - 1) % s.length())) == 'B' ? 1 : 0)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long solve(String s, long n) {
		int count = 0, rc = 0;
		
		for(char c : s.toCharArray()) {
			if(c == 'B') {
				count++;
			}
		}
		
		for(int i = 0; i < n % s.length(); i++) {
			if(s.charAt(i) == 'B') {
				rc++;
			}
		}
		return count * (n / s.length()) + rc;
	}
}
