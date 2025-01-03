import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(arr, m));
	}
	
	public static String solve(int[] arr, int m) {
		int count = 0, max = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(Math.max(arr[i], Math.max(arr[j], arr[k])) - Math.min(arr[i], Math.min(arr[j], arr[k])) <= m) {
						count++;
						max = Math.max(max, arr[i] + arr[j] + arr[k]);
					}
				}
			}
		}
		return count == 0 ? "-1" : String.format("%d %d", count, max);
	}
}
