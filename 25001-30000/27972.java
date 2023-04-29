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
		
		int answer = 1, up = 1, down = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i - 1]) {
				down++;
				up = 1;
			}
			else if(arr[i] < arr[i - 1]) {
				up++;
				down = 1;
			}
			
			answer = Math.max(answer, Math.max(up, down));
		}
		System.out.print(answer);
	}
}
