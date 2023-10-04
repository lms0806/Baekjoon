import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n / 2; i++) {
			sb.append(arr[i]).append(" ").append(arr[n - 1 - i]).append(" ");
		}
		
		if(n % 2 == 1) {
			sb.append(arr[n / 2]);
		}
		
		System.out.print(sb);
	}
}
