import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n + m == 0) {
				break;
			}
			
			int[] number = new int[10];
			
			int[] a = new int[n], b = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					int num = a[i] * b[j];
					
					while(num != 0) {
						number[num % 10]++;
						num /= 10;
					}
				}
			}
			
			for(int result : number) {
				sb.append(result).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
