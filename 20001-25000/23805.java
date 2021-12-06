import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n * 5; i++) {
			sb.append("@".repeat(n));
			if(i < n) {
				sb.append("@".repeat(n * 2)).append(" ".repeat(n));
			}
			else if(i >= n * 4){
				sb.append(" ".repeat(n)).append("@".repeat(n * 2));
			}
			else {
				sb.append(" ".repeat(n)).append("@".repeat(n)).append(" ".repeat(n));
			}
			sb.append("@".repeat(n)).append("\n");
		}
		System.out.print(sb);
	}
}
