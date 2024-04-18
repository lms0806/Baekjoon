import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine().trim());
			
			if(n == 0) {
				break;
			}
			
			int a = 0, b = 0, min = Integer.MAX_VALUE;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n / i; j++) {
					if(i * j == n && min > i + j) {
						min = i + j;
						a = i;
						b = j;
					}
				}
			}
			
			sb.append("Minimum perimeter is ").append((a + b) * 2).append(" with dimensions ").append(a).append(" x ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}
