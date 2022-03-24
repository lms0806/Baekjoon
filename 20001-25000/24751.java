import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n = Double.parseDouble(br.readLine());
		
		System.out.print(String.format("%3f", 100 / n) + "\n" + String.format("%3f", 100 / (100 - n)));
	}
}
