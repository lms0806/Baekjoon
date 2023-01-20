import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = a * b;
		
		if(a > 2 && b > 2) {
			answer -= (a - 2) * (b - 2);
		}
		
		System.out.print(answer);
	}
}
