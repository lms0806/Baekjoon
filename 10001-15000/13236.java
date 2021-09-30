import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append(n).append(" ");
		while(true) {
			if(n == 1) {
				break;
			}
			
			n = n % 2 == 0 ? n / 2 : n * 3 + 1;
			sb.append(n).append(" ");
		}
		System.out.print(sb);
	}
}
