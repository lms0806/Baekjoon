import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) / 52 / 7;
		
		for(int i = 100; i >= 1; i--) {
			if((n - i) > 0 && (n - i) % 3 == 0) {
				System.out.print(i + "\n" + ((n - i) / 3));
				break;
			}
		}
	}
}
