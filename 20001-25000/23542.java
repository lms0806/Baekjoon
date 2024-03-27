import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) << 1;
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n / 2; i++) {
			max = Math.max(max, arr[i] + arr[n - 1 - i]);
			min = Math.min(min, arr[i] + arr[n - 1 - i]);
		}
		System.out.print(max - min);
	}
}
