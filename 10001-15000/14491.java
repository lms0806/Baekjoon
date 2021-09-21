import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int answer = 0, count = 0;
		while (num > 0) {
			answer += (num % 9) * Math.pow(10, count++);
			num /= 9;
		}

		System.out.print(answer);
	}
}
