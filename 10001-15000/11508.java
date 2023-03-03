import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int answer = 0, count = 0;
		for(int i = n - 1; i >= 0; i--) {
			count++;
			
			if(count % 3 == 0) {
				continue;
			}
			
			answer += arr[i];
		}
		System.out.print(answer);
	}
}
