import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		arr[1] = Integer.parseInt(br.readLine());
		
		int answer = arr[1];
		for(int i = 2; i <= n; i++) {
			if(i % 2 == 0) {
				arr[i] = p * arr[i / 2] + q;
			}
			else {
				arr[i] = r * arr[(i - 1) / 2] + s;
			}
			answer += arr[i];
		}
		System.out.print(answer);
	}
}
