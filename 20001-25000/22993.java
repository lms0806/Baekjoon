import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n - 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long num = Integer.parseInt(st.nextToken());
		for(int i = 0; i < n - 1; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.print(solve(arr, num));
	}
	
	public static String solve(long[] arr, long num) {
		for(int i = 0; i < arr.length; i++) {
			if(num <= arr[i]) {
				return "No";
			}
			num += arr[i];
		}
		return "Yes";
	}
}
