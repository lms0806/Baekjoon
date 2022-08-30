import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[101002];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < k; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				arr[i + n].add(num);
				arr[num].add(i + n);
			}
		}
		
		System.out.print(bfs(1));
	}
	
	public static int bfs(int start) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[101002];
		queue.add(new int[] {start, 1});
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n) {
				return now[1];
			}
			
			for(int a : arr[now[0]]) {
				if(!visited[a]) {
					visited[a] = true;
					queue.add(new int[] {a, a > n ? now[1] : now[1] + 1});
				}
			}
		}
		return -1;
	}
}
