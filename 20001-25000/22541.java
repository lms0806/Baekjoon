import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int answer = 0;
			for(int i = 1; i <= n / 2; i++) {
				int sum = 0;
				for(int j = i; j <= n; j++) {
					sum += j;
					
					if(sum == n) {
						answer++;
						break;
					}
					
					if(sum > n) {
						break;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
