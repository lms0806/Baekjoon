import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long answer = 1;
		while(true) {
			n -= answer;
			
			if(n - answer - 1 < 0) {
				break;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}
