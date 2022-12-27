import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[4];
		
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int n = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		System.out.print(print(arr, n));
	}
	
	public static int print(int[] arr, int n) {
		if(arr[0] == arr[3] || (arr[0] + n == arr[1] && arr[1] == arr[2] && arr[2] == arr[3])) {
			return 1;
		}
		return 0;
	}
}
