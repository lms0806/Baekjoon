import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int sum = 0;
		while(t --> 0) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.print(sum);
	}
}
