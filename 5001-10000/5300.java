import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append(i).append(" ");
			
			if(i % 6 == 0) {
				sb.append("Go!").append(" ");
			}
		}
		System.out.print(sb + (n % 6 != 0 ? "Go!" : ""));
	}
}
