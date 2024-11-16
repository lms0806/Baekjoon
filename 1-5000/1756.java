import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n], b = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0 && a[i - 1] < a[i]) {
				a[i] = a[i - 1];
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0, idx = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(a[i] >= b[idx]) {
				idx++;
				answer = i + 1;
			}
			
			if(idx == m) {
				break;
			}
		}
		System.out.print(idx != m ? 0 : answer);
	}
}
