import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int sum = 0;
		while(t --> 0) {
			for(char c : br.readLine().toCharArray()) {
				if(c == 'A') {
					sum += 4;
				}
				else if(c == 'K') {
					sum += 3;
				}
				else if(c == 'Q') {
					sum += 2;
				}
				else if(c == 'J') {
					sum++;
				}
			}
		}
		System.out.print(sum);
	}
}
