import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static int n;
	static int[] arr;
	static boolean flag;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			flag = false;
			visited = new boolean[n + 1];
			dfs(i, i);
			
			if(flag) {
				list.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(int l : list) {
			sb.append(l).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int a, int b) {
		if(!visited[b]) {
			visited[b] = true;
			dfs(a, arr[b]);
		}
		else if(a == b) {
			flag = true;
		}
	}
}
