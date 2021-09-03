import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n - 1; i++) {
			for(int j = 1; j <= n + i; j++) {
				sb.append(j == n - i || j == n + i ? "*" : " ");
			}
			sb.append("\n");
		}
		sb.append("*".repeat(n * 2 - 1));
		System.out.print(sb);
	}
}
