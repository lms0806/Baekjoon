import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int i = 1;
		
		while(i * (i + 1) / 2 < n) {
			i++;
		}
		
		int b = n - (i - 1) * i / 2;
		int a = i + 1 - b;
		System.out.print(a + " " + b);
	}
}
