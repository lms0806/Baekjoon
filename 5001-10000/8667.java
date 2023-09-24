import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		int answer = 0;
		int s = 0, e = 1;
		for(; s < n; s++) {
			while(e < n && arr[s] == arr[e]) {
				e++;
			}
			
			answer = Math.max(answer, e - s + Math.min(k, n - e));
			
			e = s + 1;
		}
		System.out.print(answer);
	}
}
