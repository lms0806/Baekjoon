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
				for(int j = 0; j < 4; j++) {
					sb.append("@".repeat(n));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
