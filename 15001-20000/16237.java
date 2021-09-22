import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] n = new int[5];
		for(int i = 0; i < 5; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		while(n[0] + n[1] + n[2] + n[3] + n[4] != 0) {
			answer++;
			int num = 5;
			for(int i = 4; i >= 0; i--) {
				while(n[i] != 0 && num > i) {
					num -= i + 1;
					n[i]--;
				}
			}
		}
		
		System.out.print(answer);
	}
}
