import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(arr[j] >= arr[i] && arr[j] - arr[i] <= k) {
					count++;
				}
			}
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
