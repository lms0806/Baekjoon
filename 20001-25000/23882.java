import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		System.out.print(solve(arr, n, k));
	}
	
	public static String solve(int[] arr, int n, int k) {
		for(int i = n - 1; i > 0; i--) {
			int max = i;
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			
			if(max != i) {
				int temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
				
				if(--k == 0) {
					StringBuilder sb = new StringBuilder();
					for(int a : arr) {
						sb.append(a).append(" ");
					}
					return sb.toString();
				}
			}
		}
		return "-1";
	}
}
