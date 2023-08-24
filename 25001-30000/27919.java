import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cu = 0, dp = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'U' || c == 'C') {
				cu++;
			}
			else if(c == 'D' || c == 'P') {
				dp++;
			}
		}
		
		System.out.print((cu > (dp + 1) / 2 ? "U" : "") + (dp > 0 ? "DP" : ""));
	}
}
