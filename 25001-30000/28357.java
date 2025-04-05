import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		long e = 0;
		long[] arr = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
			e = Math.max(e, arr[i]);
		}
		
		long s = 0;
		while(s <= e) {
			long mid = (s + e) / 2;
			long result = sum(arr, mid);
			
			if(result > k) {
				s = mid + 1;
			}
			else {
				e = mid - 1;
			}
		}
		System.out.print(s);
	}
	
	public static long sum(long[] arr, long num) {
		long result = 0;
		for(long a : arr) {
			if(a > num) {
				result += a - num;
			}
		}
		return result;
	}
}
