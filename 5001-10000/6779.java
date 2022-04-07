import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int h, int m) {
		for(int t = 1; t <= m; t++) {
			if(-6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t <= 0) {
				return "The balloon first touches ground at hour: " + t;
			}
		}
		return "The balloon does not touch ground in the given time.";
	}
}
