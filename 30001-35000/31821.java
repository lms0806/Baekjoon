import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(n --> 0) {
			answer += arr[Integer.parseInt(br.readLine()) - 1];
		}
		System.out.print(answer);
	}
}
