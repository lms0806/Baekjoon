import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		System.out.print(Math.max(solve(arr, false), solve(arr, true)));
	}
	
	public static int solve(int[] arr, boolean flag) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!flag) {
				if(arr[i] % 2 == 0) {
					count++;
					flag = true;
				}
			}
			else {
				if(arr[i] % 2 == 1) {
					count++;
					flag = false;
				}
			}
		}
		return count;
	}
}
