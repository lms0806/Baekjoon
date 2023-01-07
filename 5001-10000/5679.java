import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int max = n;
			while(n != 1) {
				if(n % 2 == 0) {
					n /= 2;
				}
				else {
					n = n * 3 + 1;
				}
				
				max = Math.max(max, n);
			}
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
}
