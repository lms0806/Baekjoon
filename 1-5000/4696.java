import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			double a = Double.parseDouble(br.readLine());
			
			if(a == 0) {
				break;
			}
			
			sb.append(String.format("%.2f", 1 + a + Math.pow(a, 2) + Math.pow(a, 3) + Math.pow(a, 4))).append("\n");
		}
		System.out.print(sb);
	}
}
