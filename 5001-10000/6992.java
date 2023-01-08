import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int d = arr[1] - arr[0];
			if(check(arr, d)) {
				sb.append("The next 5 numbers after ").append(Arrays.toString(arr)).append(" are: [");
				for(int i = 1; i <= 5; i++) {
					sb.append(arr[n - 1] + (d * i));
					if(i < 5) {
						sb.append(", ");
					}
				}
				sb.append("]");
			}
			else {
				sb.append("The sequence ").append(Arrays.toString(arr)).append(" is not an arithmetic sequence.");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int[] arr, int d) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i - 1] != d) {
				return false;
			}
		}
		return true;
	}
}
