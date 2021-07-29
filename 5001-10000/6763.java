import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(b > a) {
			sb.append("You are speeding and your fine is ").append(b - a <= 20 ? "$100." : b - a >= 23 && b - a <= 30 ? "$270." : "$500.");
		}
		else {
			sb.append("Congratulations, you are within the speed limit!");
		}
		System.out.print(sb);
	}
}
