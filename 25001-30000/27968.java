import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
			if(i > 0) {
				arr[i] += arr[i - 1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			long num = Long.parseLong(br.readLine());
			
			int s = 0, e = n - 1;
			while(s <= e) {
				int mid = (s + e) / 2;
				
				if(arr[mid] < num) {
					s = mid + 1;
				}
				else {
					e = mid - 1;
				}
			}
			
			sb.append(s < n ? s + 1 : "Go away!").append("\n");
		}
		System.out.print(sb);
	}
}
