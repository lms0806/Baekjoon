import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] n = new int[2];
		
		for(int i = 0; i < 2; i++) {
			String[] s = br.readLine().split(" ");
			n[i] = Integer.parseInt(s[0]) * 3600 + Integer.parseInt(s[2]) * 60 + Integer.parseInt(s[4]);
		}
		
		n[1] += 3600 * 24;
		
		int num = (n[1] - n[0]) % (3600 * 24);

		if(num == 0) {
			num = 3600 * 24;
		}
		
		System.out.print(num);
	}
}
