import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int size = Integer.parseInt(st.nextToken());
			
			if(size == 0) {
				break;
			}
			
			visited = new boolean[size];
			arr = new int[size];
			for(int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, 0);
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static void dfs(int start, int depth) {
		if(depth == 6) {
			for(int i = 0; i < arr.length; i++) {
				if(visited[i]) {
					sb.append(arr[i]).append(" ");
				}
			}
			sb.append("\n");
		}
		
		for(int i = start; i < arr.length; i++) {
			visited[i] = true;
			dfs(i + 1, depth + 1);
			visited[i] = false;
		}
	}
}
