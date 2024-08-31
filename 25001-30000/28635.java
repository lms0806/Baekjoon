import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(a != b) {
			a++;
			if(a == m + 1) {
				a = 1;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
