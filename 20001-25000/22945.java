import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		int answer = 0;
		int l = 0, r = n - 1;
		while(l <= r) {
			int min = Math.min(arr[l], arr[r]);
			
			answer = Math.max((r - l - 1) * min, answer);
			
			if(arr[l] < arr[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		System.out.print(answer);
	}
}
