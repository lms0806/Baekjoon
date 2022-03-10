import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		String s = br.readLine();
		for(char c : s.toCharArray()) {
			sum += c;
		}
		
		System.out.print((char)(sum / s.length()));
	}
}
