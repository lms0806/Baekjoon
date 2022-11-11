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
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 1; i < n - 1; i++) {
				if(arr[i - 1] <= arr[i + 1] && (arr[i - 1] >= arr[i] || arr[i] >= arr[i + 1])) {
					sb.append(i + 1).append("\n");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
