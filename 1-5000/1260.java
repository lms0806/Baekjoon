import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int point = Integer.parseInt(st.nextToken());
		int line = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken()) - 1;
		
		arr = new int[point][point];
		
		while(line --> 0 ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		visited = new boolean[point];
		dfs(start);
		
		sb.append("\n");
		
		visited = new boolean[point];
		bfs(start);
		
		System.out.print(sb);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		sb.append(start + 1).append(" ");
		
		if(start == arr.length) {
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!visited[i] && arr[start][i] == 1) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(start);
		visited[start] = true;
		sb.append(start + 1).append(" ");
		
		while(!que.isEmpty()) {
			int count = 0;
			int temp = que.poll();
			for(int i = 0; i < arr.length; i++) {
				if(!visited[i] && arr[temp][i] == 1) {
					que.add(i);
					visited[i] = true;
					sb.append(i + 1).append(" ");
				}
				if(visited[i]) {
					count++;
				}
			}
			if(count == arr.length) {
				return;
			}
		}
	}
}
