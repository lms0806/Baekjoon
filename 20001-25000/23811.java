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
				if(i == 1 || i == 3) {
					sb.append("@".repeat(n));
				}
				else {
					sb.append("@".repeat(n * 5));
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
