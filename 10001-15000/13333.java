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
		
		System.out.print(solve(n, arr));
	}
	
	public static int solve(int n, int[] arr) {
		int answer = 0;
		for(int num = 0; num <= n; num++) {
			for(int i = 0; i < n; i++) {
				if(arr[i] >= num && num <= n - i && n - num <= i + 1) {
					answer = num;
				}
			}
		}
		return answer;
	}
}
