import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		long answer = 0, count = 0;
		for(char c : (br.readLine() + "0").toCharArray()) {
			if(c == '1') {
				count++;
			}
			else {
				for(int j = 1; j <= count; j++) {
					answer += j;
				}
				count = 0;
			}
		}
		System.out.print(answer);
	}
}
