import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 9; i++) {
			sb.append(":").append(i == 4 ? str : "fan").append(":");
			
			if(i % 3 == 2) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
