import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double w = Double.parseDouble(st.nextToken()), h = Double.parseDouble(st.nextToken());
		
		System.out.print(w + h - Math.pow((w * w + h * h), 0.5));
		
	}
}
