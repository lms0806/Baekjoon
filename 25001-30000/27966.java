import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append((n - 1) * (n - 1)).append("\n");
		for(int i = 1; i < n; i++) {
			sb.append(1).append(" ").append(i + 1).append("\n");
		}
		System.out.print(sb);
	}
}
