import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int max = 0, answer = 0, num = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			num = Integer.parseInt(st.nextToken());
			answer += num;
			max = Math.max(num, max);
		}

		System.out.print(answer - max);
	}
}
