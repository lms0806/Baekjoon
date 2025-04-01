import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();

		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine().replaceAll("[^0-9]", " "));
		while(st.hasMoreTokens()) {
			answer += Integer.parseInt(st.nextToken());
		}
		System.out.print(answer);
	}
}
