import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] a, b;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		a = new int[n];
		b = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			count += (a[i] != b[i]) ? 1 : 0;
		}
		
		System.out.print(count == 0 ? 1 : solve(count));
	}
 	
 	public static int solve(int count) {
 		for(int i = 1; i < n; i++) {
			int j, x = a[i];
			
			for(j = i - 1; j >= 0; j--) {
				if(x < a[j]) {
					count += (a[j + 1] == b[j + 1]) ? 1 : 0;
					a[j + 1] = a[j];
					count -= (a[j + 1] == b[j + 1]) ? 1 : 0;
					if(count == 0) {
						return 1;
					}
				}
				else {
					break;
				}
			}
			if(j + 1 != i) {
				count += (a[j + 1] == b[j + 1]) ? 1 : 0;
				a[j + 1] = x;
				count -= (a[j + 1] == b[j + 1]) ? 1 : 0;
				if(count == 0) {
					return 1;
				}
			}
		}
 		return 0;
 	}
}
