import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] n = new int[size];
		
		int end = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(st.nextToken());
			end = Math.max(end, n[i]);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		int start = 0, answer = 0;
		while(start <= end) {
			int mid = (start + end) / 2;
			
			long sum = 0;
			for(int num : n) {
				sum += Math.min(mid, num);
			}
			
			if(sum <= m) {
				answer = mid;
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		System.out.print(answer);
	}
}
