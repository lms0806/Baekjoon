import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			double n = Double.parseDouble(br.readLine());
			
			if(n < 0) {
				break;
			}
			
			sb.append("Objects weighing ").append(String.format("%.2f", n)).append(" on Earth will weigh ").append(String.format("%.2f", n * 0.167)).append(" on the moon.\n");
		}
		System.out.print(sb);
	}
}
