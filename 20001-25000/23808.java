import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < n; j++) {
				sb.append("@".repeat(n));
				if(i == 2 || i == 4) {
					sb.append("@".repeat(n * 4));
				}
				else {
					sb.append(" ".repeat(n * 3)).append("@".repeat(n));
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
