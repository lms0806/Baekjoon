import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] n = new int[2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ":");
			n[i] = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
		}
		
		n[1] += 3600 * 24;
		
		int num = (n[1] - n[0]) % (3600 * 24);

		if(num == 0) {
			num = 3600 * 24;
		}
		
		System.out.print(String.format("%02d", num / 3600) + ":" + String.format("%02d", num % 3600 / 60) + ":" + String.format("%02d", num % 60));
	}
}
