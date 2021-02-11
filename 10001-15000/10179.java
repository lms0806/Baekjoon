import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int number = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < number; i++) {
			double a = Double.parseDouble(br.readLine());
			
			sb.append("$").append(String.format("%.2f", a*0.8)).append("\n");
		}
		System.out.print(sb);
	}
}
