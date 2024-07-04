import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int a = 9999, ah = 0, am = 0;
		for(int i = h; i <= 99; i += 24) {
			for(int j = m; j <= 99; j += 60) {
				int x = d(i / 10, i % 10) + d(i % 10, j / 10) + d(j / 10, j % 10);
	            if (a > x) {
	                a = x;
	                ah = i;
	                am = j;
	            }
			}
		}
		
		System.out.printf("%02d:%02d", ah, am);
	}
	
	public static int d(int x, int y) {
		return Math.abs("3000111222".charAt(x) -'0' - ("3000111222".charAt(y) - '0')) + Math.abs(("1012012012".charAt(x) - '0' - ("1012012012".charAt(y) - '0')));
	}
}
