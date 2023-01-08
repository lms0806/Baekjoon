import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int[] a = new int[n], b = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			int suma = 0, sumb = 0;
			for(int i = 0; i < n; i++) {
				if(Math.abs(a[i] - b[i]) == 1) {
					if(a[i] < b[i]) {
						suma += a[i] == 1 && b[i] == 2 ? 6 : a[i] + b[i];
					}
					else {
						sumb += a[i] == 2 && b[i] == 1 ? 6 : a[i] + b[i];
					}
				}
				else if(a[i] == b[i]) {
					continue;
				}
				else {
					if(a[i] > b[i]) {
						suma += a[i];
					}
					else {
						sumb += b[i];
					}
				}
			}
			
			sb.append("A has ").append(suma).append(" points. B has ").append(sumb).append(" points.").append("\n\n");
		}
		System.out.print(sb);
	}
}
