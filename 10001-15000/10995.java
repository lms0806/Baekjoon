import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			if(i%2 == 1) {
				sb.append(" ");
			}
			for(int j = 0; j < size; j++) {
				sb.append("*").append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
