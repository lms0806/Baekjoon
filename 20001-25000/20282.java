import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0, num = 0;
		while(size --> 0) {
			num += Integer.parseInt(br.readLine());
			
			answer = Math.max(num, answer);
		}
		System.out.print(answer + 100);
	}
}
