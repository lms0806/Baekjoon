import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] bit = new int[20];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int n = Integer.parseInt(st.nextToken());
			
			int idx = 0;
			while(n > 0) {
				bit[idx++] += n % 2;
				n /= 2;
			}
		}
		
		int answer = 0;
		for(int b : bit) {
			answer = Math.max(answer, b);
		}
		System.out.print(answer);
	}
}
