import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		System.out.print(n % 3 != m % 3 ? -1 : (n / 3) + " " + (n % 3) + " " + (m / 3));
	}
}
