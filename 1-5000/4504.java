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
			sb.append(a);
			if(a%num == 0) {
				sb.append(" is a multiple of ");
			}
			else {
				sb.append(" is NOT a multiple of ");
			}
			sb.append(num).append(".").append("\n");
		}
		System.out.print(sb);
	}
}
