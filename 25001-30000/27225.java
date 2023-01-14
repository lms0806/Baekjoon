import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int min = Math.min(a, b);
		
		int num = 0;
		if((a - min) % 2 == 1 || (b - min) % 2 == 1) {
			num++;
		}
		
		System.out.print(min * 2 + num);
	}
}
