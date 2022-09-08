import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int min = Integer.MAX_VALUE, count = 0;
		for(int i = 1; i < n; i++) {
			if(min > arr[i] - arr[i - 1]) {
				min = arr[i] - arr[i - 1];
				count = 1;
			}
			else if(min == arr[i] - arr[i - 1]) {
				count++;
			}
		}
		
		System.out.print(min + " " + count);
	}
}
