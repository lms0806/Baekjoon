import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = 0, n1 = 0;
		while(size --> 0) {
			int a = Integer.parseInt(st.nextToken());
			n += a / 30 + 1;
			n1 += a / 60 + 1;
		}

		n *= 10;
		n1 *= 15;

		System.out.print(n > n1 ? "M " + n1 : n == n1 ? "Y M " + n : "Y " + n);
	}
}
