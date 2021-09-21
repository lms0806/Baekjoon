import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int[] n = new int[size];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		int maxa = 0, maxb = 0;
		st = new StringTokenizer(br.readLine());
		for (int a : n) {
			int b = Integer.parseInt(st.nextToken());

			if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
				maxa++;
				maxb = 0;
			} 
			else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
				maxb++;
				maxa = 0;
			} 
			else if (a == b) {
				if (maxa != 0) {
					maxa = 0;
					maxb++;
				} 
				else {
					maxa++;
					maxb = 0;
				}
			}

			answer = mnx(answer, mnx(maxa, maxb));
		}
		System.out.print(answer);
	}

	public static int mnx(int a, int b) {
		return a > b ? a : b;
	}
}
