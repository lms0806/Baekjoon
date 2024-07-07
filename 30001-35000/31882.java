import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		long answer = 0, count = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == '2') {
				count++;
			}
			else {
				count = 0;
			}
			
			answer += count * (count + 1) / 2;
		}
		System.out.print(answer);
	}
}
