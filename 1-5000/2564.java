import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t + 1];
		
		for(int i = 0; i < t + 1; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken()), which = Integer.parseInt(st.nextToken()), temp = 0;
			
			if(w == 1) {
				temp = which;
			}
			else if(w == 2) {
				temp = n + m + n - which;
			}
			else if(w == 3) {
				temp = n + m + n + m - which;
			}
			else {
				temp = n + which;
			}
			
			arr[i] = temp;
		}
		
		int answer = 0;
		for(int i = 0; i < t; i++) {
			int a = Math.abs(arr[t] - arr[i]);
			
			answer += Math.min(a, 2 * n + 2 * m - a);
		}
		System.out.print(answer);
	}
}
