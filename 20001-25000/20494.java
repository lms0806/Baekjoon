import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			answer += br.readLine().length();
		}
		System.out.print(answer);
	}
}
