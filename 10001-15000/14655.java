import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.print(sum(br.readLine(), n) + sum(br.readLine(), n));
	}

	public static long sum(String s, int n) {
		StringTokenizer st = new StringTokenizer(s);
		long answer = 0;
		while (n --> 0) {
			answer += Math.abs(Integer.parseInt(st.nextToken()));
		}
		return answer;
	}
}
