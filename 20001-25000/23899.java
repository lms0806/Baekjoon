import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		a = new int[n];
		b = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve());
	}
	
	public static int solve() {
		for(int i = n - 1; i >= 0; i--) {
			if(check()) {
				return 1;
			}
			
			int max = i;
			for(int j = 0; j < i; j++) {
				if(a[j] > a[max]) {
					max = j;
				}
			}
			
			if(max != i) {
				int temp = a[max];
				a[max] = a[i];
				a[i] = temp;
			}
		}
		return 0;
	}
	
	public static boolean check() {
		for(int i = 0; i < n; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
