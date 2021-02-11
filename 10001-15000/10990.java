import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-i-1; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 1; j < 2*i; j++) {
				sb.append(" ");
			}
			if(i > 0) {
				sb.append("*").append("\n");
			}
			else {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
