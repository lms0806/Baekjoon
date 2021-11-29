import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append("@".repeat(n + 2)).append("\n");
		for(int i = 0; i < n; i++) {
			sb.append("@").append(" ".repeat(n)).append("@").append("\n");
		}
		sb.append("@".repeat(n + 2));
		System.out.print(sb);
	}
}
