import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken()), a2 = Integer.parseInt(st.nextToken()), a3 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken()), b2 = Integer.parseInt(st.nextToken()), b3 = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i <= b1; i++) {
			for(int j = 0; j <= b2; j++) {
				for(int k = 0; k <= b3; k++) {
					if(a1 * i + a2 * j + a3 * k >= l) {
						answer = Math.min(answer, i + j + k);
					}
				}
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? 0 : answer);
	}
}
