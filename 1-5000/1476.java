import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int e = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

		int answer = 1;
		while(true) {
			if((answer - e) % 15 == 0 && (answer - s) % 28 == 0 && (answer - m) % 19 == 0) {
				break;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
