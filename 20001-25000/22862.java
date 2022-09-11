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
		
		int answer = 0;
		int start = 0, end = 0;
		int kcount = 0;
		while(true) {
			answer = Math.max(answer, end - start - kcount);
			if(end == n) {
				break;
			}
			
			if(arr[end] % 2 == 1) {
				kcount++;
			}
			
			while(kcount > k && arr[end] % 2 == 1) {
				if(arr[start] % 2 == 1) {
					start++;
					kcount--;
					break;
				}
				start++;
			}
			
			end++;
		}
		System.out.print(answer);
	}
}
