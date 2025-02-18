import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("%.1f", Math.ceil(Math.sqrt(Double.parseDouble(br.readLine()) / Math.PI) * 20.0 * Math.PI) / 10.0);
	}
}
