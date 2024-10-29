import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		long answer = 0, num = 1, count = 1;
		while(n --> 0) {
			answer += num;
			count++;
			num += count;
		}
		System.out.print(answer);
	}
}
