import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			
			int sum = 0;
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			sb.append(solve(arr, sum)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] arr, int sum) {
		if(sum % 2 == 1) {
			return "No equal partitioning.";
		}
		
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			num += arr[i];
			
			if(sum / 2 == num) {
				return String.format("Sam stops at position %d and Ella stops at position %d.", i + 1, i + 2);
			}
		}
		return "No equal partitioning.";
	}
}
