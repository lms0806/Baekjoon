import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long n = Long.parseLong(br.readLine());
		
		long start = 0, end = n, min = Long.MAX_VALUE;
		
		while(start <= end) {
			long mid = (start + end) / 2;
			long value = (long)Math.pow(mid, 2);
			
			if(value >= 0) {
				if(value >= n) {
					min = Math.min(min, mid);
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		System.out.print(min);
	}
}
