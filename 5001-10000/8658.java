import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n/2; i++) {
			if(n % i != 0) {
				sb.append(i).append(" ");
				break;
			}
		}
		
		for(int i = n - 1; i >= n/2; i--) {
			if(n % i != 0) {
				sb.append(i);
				break;
			}
		}
		System.out.print(sb);
	}
}
