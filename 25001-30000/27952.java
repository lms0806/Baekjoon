import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long x = Long.parseLong(st.nextToken());
		
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		long answer = 0, kg = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			kg += Long.parseLong(st.nextToken());
			if(kg < arr[i]) {
				answer = -1;
				break;
			}
		}
		
		System.out.print(answer == -1 ? -1 : (kg - arr[n - 1]) / x);
	}
}
