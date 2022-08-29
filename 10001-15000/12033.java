import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n * 2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n * 2; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int[] answer = new int[n];
			boolean[] visited = new boolean[n * 2];
			int idx = 0;
			for(int j = 0; j < n * 2; j++) {
				if(visited[j]) {
					continue;
				}
				for(int k = 0; k < n * 2; k++) {
					if(j == k || visited[k]) {
						continue;
					}
					
					if(arr[j] == arr[k] * 0.75) {
						answer[idx] = arr[j];
						idx++;
						visited[j] = true;
						visited[k] = true;
						break;
					}
				}
			}
			
			Arrays.sort(answer);
			
			sb.append("Case #").append(i).append(": ");
			for(int a : answer) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			
		}
		System.out.print(sb);
	}
}
