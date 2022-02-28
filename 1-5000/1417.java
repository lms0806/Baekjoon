import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) - 1;
		int dasom = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print(solve(dasom, arr));
	}
	
	public static int solve(int dasom, int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		
		int min = 0;
		while(true) {
			Arrays.sort(arr);
			
			if(dasom <= arr[arr.length - 1]) {
				dasom++;
				arr[arr.length - 1]--;
				min++;
			}
			else {
				return min;
			}
		}
	}
}
