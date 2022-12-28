import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double x = Double.parseDouble(st.nextToken()), y = Double.parseDouble(st.nextToken());
		
		System.out.print((1 / (1 - x / 100) - 1) / (1 / (1 - y / 100) - 1));
	}
}
