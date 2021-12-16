import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[] a = new int[n], b = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			long sum = 0;
			int idx = 0;
			for(int i = 0; i < n; i++) {
				while(idx < m - 1) {
					if(b[idx] >= a[i]) {
						break;
					}
					idx++;
				}
				if(idx == 0) {
					sum += b[0];
				}
				else {
					sum += Math.abs(b[idx - 1] - a[i]) <= Math.abs(b[idx] - a[i]) ? b[idx - 1] : b[idx];
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
