import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] number = new int[10];
		long sum = Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()) * Long.parseLong(br.readLine());

		while (sum != 0) {
			number[(int)(sum % 10)]++;
			sum /= 10;
		}

		StringBuilder sb = new StringBuilder();
		for (int n : number) {
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
