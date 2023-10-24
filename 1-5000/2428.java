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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			int s = i + 1, e = n - 1;
			int num = i;
			while(s <= e) {
				int mid = (s + e) / 2;
				
				if(arr[i] * 10 >= arr[mid] * 9) {
					num = mid;
					s = mid + 1;
				}
				else {
					e = mid - 1;
				}
			}
			
			answer += num - i;
		}
		System.out.print(answer);
	}
}
