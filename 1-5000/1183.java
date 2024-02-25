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
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int answer = 1;
		if(n % 2 == 0) {
			int mid = n / 2 - 1;
			answer = arr[mid + 1] - arr[mid] + 1;
		}
		System.out.print(answer);
	}
}
