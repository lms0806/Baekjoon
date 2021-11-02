import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		
		int answer = 0;
		for(char ch : br.readLine().toCharArray()) {
			answer += (ch - '0');
		}
		System.out.print(answer);
	}
}
