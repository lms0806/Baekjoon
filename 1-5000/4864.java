import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int sum = 0;
			int money = 1, count = 0;
			for(int i = 0; i < n; i++) {
				sum += money;
				
				count++;
				
				if(count == money) {
					money++;
					count = 0;
				}
			}
			sb.append(n).append(" ").append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
