import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[k];
		long end = 0, sum = 0;
		for(int i = 0; i < k; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
			end = Math.max(end, num[i]);
		}
		
		long start = 1;
		while(start <= end) {
			long mid = (start + end) / 2;
			
			long count = 0;
			for(int n : num) {
				count += n / mid;
			}
			
			if(count >= m) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		System.out.print(sum - end * m);
	}
}
