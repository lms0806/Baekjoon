import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[5];
		
		br.readLine();
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'A']++;
		}
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(alpha[i] > 0) {
				count++;
			}
		}
		
		System.out.print(count >= 3 ? "Yes" : "No");
	}
}
