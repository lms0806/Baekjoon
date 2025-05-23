import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n], b = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int answer = 0, idx = n - 1;
		for(int i = n - 1; i >= 0; i--) {
			if(a[i] >= b[idx]) {
				continue;
			}
			
			answer++;
			idx--;
		}
		System.out.print(n / 2 < answer ? "YES" : "NO");
	}
}
