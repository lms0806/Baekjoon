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
			int n = Integer.parseInt(st.nextToken());
			
			sb.append(upper_bound(n, 0, arr.length) - lower_bound(n, 0, arr.length)).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int lower_bound(int input, int first, int end) {
		while(first < end) {
			int mid = (first + end) / 2;
			
			if(input <= arr[mid]){
				end = mid;
			}
			else {
				first = mid + 1;
			}
		}
		return end;
	}
	
	public static int upper_bound(int input, int first, int end) {
		while(first < end) {
			int mid = (first + end) / 2;
			
			if(input >= arr[mid]){
				first = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return end;
	}
}
