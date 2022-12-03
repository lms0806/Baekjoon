import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0, max = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < max) {
				answer = Math.max(answer, max - arr[i]);
			}
			else {
				max = arr[i];
			}
		}
		System.out.print(answer);
	}
}
