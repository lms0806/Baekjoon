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
			
			int min = Integer.MAX_VALUE;
			for(int i = 0; i * i * i <= n; i++) {
				for(int j = 0; i * i * i + j * j <= n; j++) {
					int num = i * i * i + j * j;
					if(num <= n && min > i + j + n - num) {
						min = i + j + n - num;
					}
				}
			}
			sb.append(min).append("\n");
		}
		System.out.print(sb);
	}
}
