import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];

		long low = -1, high = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			high += arr[i];
			low = Math.max(low, arr[i]);
		}
		
		while(low <= high) {
			long count = 0, sum = 0;
			long mid = (low + high) >> 1;
		
			for(int i = 0; i < n; i++) {
				if(sum + arr[i] > mid) {
					sum = 0;
					count++;
				}
				sum += arr[i];
			}
			
			if(sum != 0) {
				count++;
			}
			
			if(count <= m) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		System.out.print(low);
	}
}
