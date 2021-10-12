import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		hanoi(1, 3, n);
		System.out.print((int)(Math.pow(2, n) - 1) + "\n" + sb);
	}
	
	public static int hanoi(int from, int to, int n) {
		if(n == 1) {
			sb.append(from + " " + to).append("\n");
			return 0;
		}
		
		hanoi(from ,6 - from - to, n - 1);
		sb.append(from + " " + to).append("\n");
		hanoi(6 - from - to, to, n - 1);
		return 0;
	}
}
