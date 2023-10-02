import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	static int n;
	static int[] t;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			t = new int[n * 2];
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				
				char c = st.nextToken().charAt(0);
				int a = Integer.parseInt(st.nextToken()) - 1;
				int b = Integer.parseInt(st.nextToken());
				
				if(c == 'P') {
					update(a, b);
				}
				else {
					sb.append(query(a, b)).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
	
	public static void init() {
		for(int i = n - 1; i > 0; i--) {
			t[i] = t[i << 1] + t[i << 1 | 1];
		}
	}
	
	public static void update(int p, int value) {
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
