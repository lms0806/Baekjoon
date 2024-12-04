import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		
		long[] n = new long[m], a = new long[m];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			n[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			a[i] = Long.parseLong(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			long answer = -1;
			
			if(a[i] == 0) {
				answer = 0;
			}
			else if(n[i] == 1) {
				answer = 1;
			}
			else {
				long l = 1, r = a[i];
				while(l <= r) {
					long mid = (l + r) >> 1;
				
					long total = mid, now = mid;
					while(total < a[i] && now >= n[i]) {
						total += now / n[i];
						now = now / n[i] + now % n[i];
					}
					
					if(total >= a[i]) {
						answer = mid;
						r = mid - 1;
					}
					else {
						l = mid + 1;
					}
				}
			}
			sb.append(answer).append(" ");
		}
		System.out.print(sb);
	}
}
