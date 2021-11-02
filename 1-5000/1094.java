import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(x != 0) {
			answer += (x % 2);
			x /= 2;
		}
		System.out.print(answer);
	}
}
