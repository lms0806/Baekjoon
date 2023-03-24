import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			int sum = 0;
			
			for(int j = 1; j <= n; j++) {
				sum += j >= i ? (j - i) * arr[j] : (j + n - i) * arr[j];
			}
			
			answer = Math.min(answer, sum);
		}
		System.out.print(answer);
	}
}
