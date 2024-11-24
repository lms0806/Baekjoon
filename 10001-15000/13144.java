import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		boolean[] visited = new boolean[100001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int end = 0;
		long answer = 0;
		for(int i = 0; i < n; i++) {
			while(end < n) {
				if(visited[arr[end]]) {
					break;
				}
				visited[arr[end]] = true;
				end++;
			}
			
			answer += end - i;
			visited[arr[i]] = false;
		}
		System.out.print(answer);
	}
}
