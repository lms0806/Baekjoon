import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max1 = 0, max2 = 0;
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max1 <= arr[i]) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(max2 < arr[i]) {
				max2 = arr[i];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i] - (arr[i] == max1 ? max2 : max1)).append(" ");
		}
		System.out.print(sb);
	}
}
