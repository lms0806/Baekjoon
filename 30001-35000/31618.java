import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.print(solve(arr));
	}
	
	public static String solve(int[] arr) {
		for(int i = 0; i < arr.length - 2; i++) {
			if(arr[arr.length - 1] - arr[i] < 6) {
				return "No";
			}
			
			for(int j = i + 1; j < arr.length - 1; j++) {				
				if(arr[j] - arr[i] > 3) {
					break;
				}
				else if(arr[j] - arr[i] < 3) {
					continue;
				}
				
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[k] - arr[i] > 6) {
						break;
					}
					else if(arr[k] - arr[i] == 6) {
						return "Yes";
					}
				}
			}
		}
		return "No";
	}
}
