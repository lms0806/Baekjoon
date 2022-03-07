import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = n / 4, b = 0;
		
		int answer = 0;
		while(a > -1) {
			if(a * 4 + b * 5 < n) {
				b++;
			}
			else {
				if(a * 4 + b * 5 == n) {
					answer++;
				}
				a--;
			}
		}
		System.out.print(answer);
	}
}
