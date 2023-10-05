import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long max = 0;
		long[] arr = new long[n], count = new long[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			
			count[i] = m;
			
			while(m --> 0) {
				arr[i] = Math.max(arr[i], Long.parseLong(st.nextToken()));
			}
			
			max = Math.max(max, arr[i]);
		}
		
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (max - arr[i]) * count[i];
		}
		System.out.print(sum);
	}
}
