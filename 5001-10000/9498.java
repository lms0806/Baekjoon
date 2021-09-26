import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(Integer.parseInt(br.readLine())));
	}

	public static char solve(int a) {
		return a > 89 ? 'A' : a > 79 ? 'B' : a > 69 ? 'C' : a > 59 ? 'D' : 'F';
	}
}
