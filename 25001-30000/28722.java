import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.print(s.length() == 1 || s.charAt(0) == s.charAt(s.length() - 1) ? "Lose" : "Win");
	}
}
