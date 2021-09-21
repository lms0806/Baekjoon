import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());

		boolean[] boo = new boolean[size];
		while(num --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken());

			while (a < size) {
				boo[a] = true;
				a += b;
			}
		}

		int answer = 0;
		for (boolean b : boo) {
			if (!b) {
				answer++;
			}
		}

		System.out.print(answer);
	}
}
