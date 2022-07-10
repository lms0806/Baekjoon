import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());

		int x = 1, y = 1, z = 0;
		for(int i = 0; i < n - 2; i++) {
			z = y;
			y = (x + y) % 1000000007;
			x = z;
		}
		
		System.out.print(y + " " + (n - 2));
	}
}
