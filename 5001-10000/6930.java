import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int x, int m) {
		for(int i = 1; i < 100; i++) {
			if((x * i) % m == 1) {
				return i + "";
			}
		}
		return "No such integer exists.";
	}
}
