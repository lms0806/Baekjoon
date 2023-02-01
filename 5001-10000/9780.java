import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
			
			long[] arr = new long[n], sum = new long[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				sum[i] = arr[i] = Long.parseLong(st.nextToken());
				if(i > 0) {
					sum[i] += sum[i - 1];
				}
			}
			
			while(q --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				sb.append(sum[b] - sum[a] + arr[a]).append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
