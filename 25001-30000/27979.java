import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n], sort_arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sort_arr[i] = arr[i];
		}
		
		Arrays.sort(sort_arr);
		
		int idx = n - 1;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] == sort_arr[idx]) {
				idx--;
			}
		}
		System.out.print(idx + 1);
	}
}
