import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 1; i < n - 1; i++) {
			int left = 0, right = 0;
			
			for(int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}
			for(int j = n - 1; j > i; j--) {
				right = Math.max(right, arr[j]);
			}
			
			answer += Math.max(0, Math.min(left, right) - arr[i]);
		}
		System.out.print(answer);
	}
}
