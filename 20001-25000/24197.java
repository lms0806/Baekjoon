import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arr[0] = 1;
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer += Math.min(Math.abs(arr[i + 1] - arr[i]), Math.min(arr[i] + m - arr[i + 1], m - arr[i] + arr[i + 1]));
		}
		System.out.print(answer);
	}
}
