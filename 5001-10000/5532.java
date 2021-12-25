import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());

		int num1 = a / c + (a % c != 0 ? 1 : 0);
		int num2 = b / d + (b % d != 0 ? 1 : 0);
		
		System.out.println(l - Math.max(num1, num2));
	}
}
