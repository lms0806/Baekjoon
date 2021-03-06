import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				break;
			}
			
			for(int i = 0; i < a; i++) {
				for(int j = a-i-1; j < a; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
