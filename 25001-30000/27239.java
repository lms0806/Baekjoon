import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()) - 1;
		
		System.out.print((char)((n % 8) + 'a') + "" + (n / 8 + 1));
	}
}
