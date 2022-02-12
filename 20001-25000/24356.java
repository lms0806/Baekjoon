import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h1 = Integer.parseInt(st.nextToken()), m1 = Integer.parseInt(st.nextToken());
		int h2 = Integer.parseInt(st.nextToken()), m2 = Integer.parseInt(st.nextToken());
		
		int answer = ((60 * h2 + m2) - (60 * h1 + m1) + 24 * 60) % 1440;
		
		System.out.print(answer + " " + answer / 30);
	}
}
