import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int count = 0;
		double sum = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == '0') {
				sum += 10;
				i--;
			}
			else {
				sum += s.charAt(i) - '0';
			}
			count++;
		}
		
		System.out.print(String.format("%.2f", sum / count));
	}
}
