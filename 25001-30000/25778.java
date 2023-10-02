import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	static int n;
	static long[] t;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		t = new long[n * 2];
		
		for(int i = 0; i < n; i++) {
			t[i + n] = Long.parseLong(br.readLine());
		}
		
		init();
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			int a = Integer.parseInt(st.nextToken()) - 1;
			long b = Long.parseLong(st.nextToken());
			
			if(c == 'U') {
				update(a, b);
			}
			else {
				sb.append(query(a, (int)b)).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void init() {
		for(int i = n - 1; i > 0; i--) {
			t[i] = t[i << 1] + t[i << 1 | 1];
		}
	}
	
	public static void update(int p, long value) {
		for(t[p += n] += value; p > 1; p >>= 1) {
			t[p >> 1] = t[p] + t[p ^ 1];
		}
	}
	
	public static long query(int l, int r) {
		long answer = 0;
		for(l += n, r += n; l < r; l >>= 1, r >>= 1) {
			if(l % 2 == 1) {
				answer += t[l++];
			}
			if(r % 2 == 1) {
				answer += t[--r];
			}
		}
		return answer;
	}
}
