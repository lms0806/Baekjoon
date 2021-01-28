import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				break;
			}
			
			if(num >= 1000000 && num < 5000000) {
				num *= 0.9;
			}
			else if(num >= 5000000) {
				num *= 0.8;
			}
			
			sb.append(num).append("\n");
		}
		System.out.println(sb);
	}
}
