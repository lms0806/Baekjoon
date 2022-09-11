import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(br.readLine());
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			long sum = 0;
			int j = i;
			
			while(j < n) {
				sum += arr[j];
				
				if(sum > k) {
					answer += arr.length - j;
					break;
				}
				j++;
			}
		}
		System.out.print(answer);
	}
}
