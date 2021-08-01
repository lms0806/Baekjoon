import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			int[] arr = new int[num];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			num = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			while(num --> 0) {
				sb.append(binary_search(arr, 0, arr.length - 1, Integer.parseInt(st.nextToken()))).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static int binary_search(int[] arr, int start, int end, int n) {
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(arr[mid] == n) {
				return 1;
			}
			
			if(n < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return 0;
	}
}
