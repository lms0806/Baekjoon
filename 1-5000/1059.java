import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		arr[n] = 0;
		Arrays.sort(arr);
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.print(solve(arr, num));
	}
	
	public static long solve(int[] arr, int num) {
		int answer = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == num || arr[i + 1] == num) {
				return 0;
			}
			if(arr[i] < num && arr[i + 1] > num) {
				answer = (num - arr[i]) * (arr[i + 1] - num) - 1;
			}
		}
		
		return answer;
	}
}
