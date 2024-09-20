import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());
		
		int apple = a * b;
		
		int value = apple / 12 * d;
		if(apple % 12 != 0) {
			value += d;
		}
		
		System.out.print(value);
	}
}
