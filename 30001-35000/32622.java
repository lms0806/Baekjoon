import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int one = 0, zero = 0, answer = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				if(i > 0 && arr[i] != arr[i - 1]) {
					zero = 0;
				}
				zero++;
				
				answer = Math.max(answer, zero + one);
			}
			else {
				if(i > 0 && arr[i] != arr[i - 1]) {
					one = 0;
				}
				one++;
				
				answer = Math.max(answer, zero + one);
			}
		}
		System.out.print(answer);
	}
}
