import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if((i % a == 0 && i % b != 0) || (i % a != 0 && i % b == 0)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
