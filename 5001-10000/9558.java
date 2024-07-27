import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			int answer = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				for(int j = 0; j < arr.length; j++) {
					answer = Math.min(answer, Math.abs(num - arr[j]));
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
