import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long sum = 0;
		for(int i = 0; i < 12; i++) {
			sum += (Double.parseDouble(br.readLine()) * 100);
		}
		System.out.print("$" + String.format("%.2f", sum / 12.0 / 100.0));
	}
}
