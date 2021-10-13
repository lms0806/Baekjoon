import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		arr = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			sb.append(binary_search(Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int binary_search(int input) {
		int first = 0, end = arr.length - 1;
		while(first <= end) {
			int mid = (first + end) / 2;
			
			if(input == arr[mid]) {
				return 1;
			}
            
			if(input < arr[mid]){
				end = mid - 1;
			}
			else {
				first = mid + 1;
			}
		}
		return 0;
	}
}
