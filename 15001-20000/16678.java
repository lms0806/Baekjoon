import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long answer = 0, num = 1;
		for(long a : arr) {
			if(a >= num) {
				answer += a - num;
				num++;
			}
		}
		System.out.print(answer);
	}
}
