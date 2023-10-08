import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sum += arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == sum - arr[i]) {
				answer = i + 1;
				break;
			}
		}
		System.out.print(answer);
	}
}
