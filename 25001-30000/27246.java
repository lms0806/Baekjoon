import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long q = Long.parseLong(br.readLine());
		
		long answer = 0;
		for(long i = 1; i * i <= q; i++) {
			answer++;
			q -= i * i;
		}
		System.out.print(answer);
	}
}
