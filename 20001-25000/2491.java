import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		solve(true, n, arr);
		solve(false, n, arr);
		
		System.out.print(answer);
	}
	
	public static void solve(boolean flag, int n, int[] arr) {
		int count = 1;
		for(int i = 1; i < n; i++) {
			if(flag && arr[i - 1] <= arr[i]) {
				count++;
			}
			else if(!flag && arr[i - 1] >= arr[i]) {
				count++;
			}
			else {
				count = 1;
			}
			
			if(answer < count) {
				answer = count;
			}
		}
	}
}
