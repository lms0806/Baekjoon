import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		boolean[] visited = new boolean[w + 1];
		visited[w] = true;
		
		int[] arr = new int[p];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < p; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			visited[w - arr[i]] = true;
			visited[arr[i]] = true;
		}
		
		for(int i = 0; i < p; i++) {
			for(int j = i + 1; j < p; j++) {
				visited[Math.abs(arr[i] - arr[j])] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= w; i++) {
			if(visited[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb);
	}
}
