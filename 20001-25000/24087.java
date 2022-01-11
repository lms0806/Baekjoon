import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine()), price = 250;
		int b = Integer.parseInt(br.readLine());
		
		while(a < n) {
			a += b;
			price += 100;
		}
		
		System.out.print(price);
	}
}
