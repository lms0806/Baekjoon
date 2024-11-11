import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for(int i = 0; i <= n - w; i++) {
				int sum = 0;
				for(int j = i; j < i + w; j++) {
					sum += arr[j];
				}
				
				min = Math.min(min, sum / w);
				max = Math.max(max, sum / w);
			}
			sb.append(String.format("Data Set %d:\n", t)).append(max - min).append("\n\n");
		}
		System.out.print(sb);
	}
}
