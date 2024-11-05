import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			int[] a = new int[n], b = new int[m];
			
			int suma = 0, sumb = 0;
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(br.readLine());
				suma += a[i];
			}
			for(int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(br.readLine());
				sumb += b[i];
			}
			
			sb.append(solve(a, b, suma, sumb)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] a, int[] b, int suma, int sumb) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(suma - a[i] + b[j] == sumb - b[j] + a[i]) {
					return a[i] + " " + b[j];
				}
			}
		}
		return "-1";
	}
}
