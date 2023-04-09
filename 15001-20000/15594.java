import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		for(int i = n - 1; i >= 0; i--) {
			int max = arr[i], idx = i;
			for(int j = 0; j < i; j++) {
				if(max < arr[j]) {
					max = arr[j];
					idx = j;
				}
			}
			
			if(idx != i) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
