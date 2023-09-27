import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		long answer = arr[n - 1];
		
		if(n % 2 == 1) {
			n--;
		}
		
		for(int i = 0; i < n / 2; i++) {
			answer = Math.max(answer, arr[i] + arr[n - i - 1]);
		}
		System.out.print(answer);
	}
}
