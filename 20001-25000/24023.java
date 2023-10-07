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
		int s = 1, e = 1;
		for(int i = 0; i < n; i++) {
			if(s == -1) {
				s = i + 1;
			}
			
			if((k | arr[i]) > k) {
				answer = 0;
				s = -1;
				e = -1;
			}
			else {
				if((answer |= arr[i]) == k) {
					e = i + 1;
					break;
				}
			}
		}
		System.out.print(answer == k ? s + " " + e : -1);
	}
}
