import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		System.out.print(111 * x * x + 11 * x + 1);
	}
}
