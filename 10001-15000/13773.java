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
			
			sb.append(n);
			if(n % 4 != 0 || n < 1896) {
				sb.append(" No summer games");
			}
			else if(n > 2020) {
				sb.append(" No city yet chosen");
			}
			else if((1914 <= n && n <= 1918) || (1939 <= n && n <= 1945)) {
				sb.append(" Games cancelled");
			}
			else {
				sb.append(" Summer Olympics");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
