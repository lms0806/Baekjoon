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
		
		long answer = Long.MIN_VALUE;
		long num = 0;
		for(int i = 0; i < n; i++) {
			if(answer < (n - i) * arr[i]) {
				answer = (n - i) * arr[i];
				num = arr[i];
			}
		}
		System.out.print(answer + " " + num);
	}
}
