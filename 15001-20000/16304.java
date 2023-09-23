import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.print(solve(arr, x));
	}
	
	public static int solve(int[] arr, int x) {
		if(arr.length == 1) {
			return 1;
		}
		
		int i = 1;
		for(; i < arr.length; i++) {
			if(arr[i - 1] + arr[i] > x) {
				break;
			}
		}
		return i;
	}
}
