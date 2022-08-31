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
			
			while(n >= 10) {
				sb.append(n).append(" ");
				int num = 1;
				
				while(n != 0) {
					num *= n % 10;
					n /= 10;
				}
				n = num;
			}
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
