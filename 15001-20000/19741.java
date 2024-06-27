import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n * n + 1];
		for(int i = 2; i <= n * n; i++) {
			for(int j = i; j < arr.length; j += i) {
				arr[j]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n * n; i++) {
			sb.append(arr[i] < k ? "*" : ".");
			
			if(i % n == 0) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
