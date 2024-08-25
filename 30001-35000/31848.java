import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[100001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + i - 1;
		}
		
		int[] where = new int[100001];
		
		int now = 0;
		for(int i = 1; i <= n; i++) {
			if(arr[i] <= now) {
				continue;
			}
			
			for(int j = now; j <= Math.min(arr[i], n); j++) {
				if(where[j] == 0) {
					where[j] = i;
				}
			}
			now = arr[i];
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			sb.append(where[Integer.parseInt(st.nextToken())]).append(" ");
		}
		System.out.print(sb);
	}
}
