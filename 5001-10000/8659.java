import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n], sum = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sum[i] = arr[i] = Integer.parseInt(st.nextToken()) == 0 ? 1 : 0;
			
			if(i > 0) {
				sum[i] += sum[i - 1];
			}
		}
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				answer += sum[i];
			}
		}
		
		System.out.print(answer);
	}
}
