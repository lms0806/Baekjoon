import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long answer = 0;
		while(n != 1) {
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n = n * 3 + 1;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
