import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int start = num, number = 0, count = 0;
		while (true) {
			count++;
			number = num / 10 + num % 10;
			num = number % 10 + (num % 10) * 10;
			if (start == num) {
				break;
			}
		}
		System.out.print(count);
	}
}
