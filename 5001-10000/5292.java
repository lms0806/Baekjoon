import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			boolean flag = true;
			
			if(i % 3 == 0) {
				sb.append("Dead");
				flag = false;
			}
			if(i % 5 == 0) {
				sb.append("Man");
				flag = false;
			}
			
			if(flag) {
				sb.append(i).append(" ");
			}
			else {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
