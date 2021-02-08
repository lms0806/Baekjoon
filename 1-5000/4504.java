import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				break;
			}
			
			if(a%num == 0) {
				sb.append(a).append(" is a multiple of ").append(num).append(".");
			}
			else {
				sb.append(a).append(" is NOT a multiple of ").append(num).append(".");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
