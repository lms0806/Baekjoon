import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 1; i < n; i++) {
			for(int j = i; j < n; j++) {
				int c = n - i - j;
				
				if(c < j) {
					break;
				}
				if(i + j > c) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
