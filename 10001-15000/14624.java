import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(n % 2 == 0) {
			sb.append("I LOVE CBNU");
		}
		else {
			sb.append("*".repeat(n)).append("\n");
			sb.append(" ".repeat(n / 2)).append("*").append("\n");
			
			for(int i = 2; i < n; i += 2) {
				sb.append(" ".repeat((n - i) / 2)).append("*").append(" ".repeat(i - 1)).append("*").append("\n");
			}
		}
		System.out.print(sb);
	}
}
