import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = Integer.MAX_VALUE;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i * j > n) {
						break;
					}
					
					int k = n / i / j;
					
					if(i * j * k == n) {
						answer = Math.min(answer, 2 * (i * j + j * k + k * i));
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
