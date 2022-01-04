import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] arr, arr1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		arr1 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
			if(arr[i] != arr1[i]) {
				count++;
			}
		}
		
		System.out.print(count == 0 ? 1 : solve(count));
	}
	
	public static int solve(int count) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					count += (arr[j] == arr1[j]) ? 1 : 0;
					count += (arr[j + 1] == arr1[j + 1]) ? 1 : 0;
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					count -= (arr[j] == arr1[j]) ? 1 : 0;
					count -= (arr[j + 1] == arr1[j + 1]) ? 1 : 0;
					
					if(count == 0) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
