import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			sb.append(c == 'J' ? 'O' : c == 'O' ? 'I' : 'J');
		}
		System.out.print(sb);
	}
}
