import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int s = 0, e = 0;
		int answer = Integer.MAX_VALUE;
		int count = arr[0] == 1 ? 1 : 0;
		while(e < n) {			
			if(count >= k) {
				answer = Math.min(answer, e - s + 1);
				if(arr[s] == 1) {
					count--;
				}
				s++;
			}
			else {
				e++;
				if(e < n && arr[e] == 1) {
					count++;
				}
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
}
