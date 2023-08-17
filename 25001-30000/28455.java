import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		
		int sum_level = 0, block = 0;
		int start = n - 1, end = n > 42 ? n - 42 : 0;
		for(int i = start; i >= end; i--){
			sum_level += arr[i];
			
			block += arr[i] >= 250 ? 5 : arr[i] >= 200 ? 4 : arr[i] >= 140 ? 3 : arr[i] >= 100 ? 2 : arr[i] >= 60 ? 1 : 0;
		}

		System.out.print(sum_level + " " + block);
	}
}
