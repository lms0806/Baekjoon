import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] b = new boolean[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		if(m != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(m --> 0) {
				b[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int answer = Math.abs(n - 100);
		for(int i = 0; i < 1000001; i++) {
			int len = check(i);
			
			if(len > 0) {
				int count = Math.abs(n - i);
				
				answer = Math.min(answer, len + count);
			}
		}
		System.out.print(answer);
	}
	
	public static int check(int n) {
		if(n == 0) {
			return b[0] ? 0 : 1;
		}
		
		int len = 0;
		while(n > 0) {
			if(b[n % 10]) {
				return 0;
			}
			len++;
			n /= 10;
		}
		return len;
	}
}
