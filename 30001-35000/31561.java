import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double m = Double.parseDouble(br.readLine());
		
		System.out.print(m > 30 ? 15 + (m - 30) * 3 / 2 : m / 2);
	}
}
