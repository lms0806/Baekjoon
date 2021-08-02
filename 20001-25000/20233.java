import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), x = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int answer = a + (n > 30 ? 21 * (n - 30) * x : 0), answer1 = b + (n > 45 ? 21 * (n - 45) * y : 0);
		
		System.out.print(answer + " " + answer1);
	}
}
