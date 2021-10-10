import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i % 10000000;

			while (sum % 10 == 0) {
				sum /= 10;
			}
		}

		System.out.println(sum % 10);
	}
}
