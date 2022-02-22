import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			answer = Math.max(answer, arr[i]);
		}
		
		for(int i = 1; i < n - 1; i++) {
			answer = Math.max(answer, arr[i] + Math.min(arr[i - 1], arr[i + 1]));
		}
		System.out.print(answer);
	}
}
