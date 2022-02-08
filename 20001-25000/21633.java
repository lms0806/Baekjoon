import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double answer = Double.parseDouble(br.readLine()) * 0.01 + 25;
		
		if(answer > 2000) {
			answer = 2000;
		}
		if(answer < 100) {
			answer = 100;
		}
		
		System.out.print(String.format("%.2f", answer));
	}
}
