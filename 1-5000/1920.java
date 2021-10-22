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
			sb.append(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) < 0 ? 0 : 1).append("\n");
		}
		System.out.print(sb);
	}
}
