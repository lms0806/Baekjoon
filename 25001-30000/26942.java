import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
	
		arr = new ArrayList[n];
		visited = new boolean[n];
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
			arr[i] = new ArrayList<>();
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = map.get(st.nextToken()), b = map.get(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				bfs(i);
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList<>();
		visited[x] = true;
		queue.add(x);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int a : arr[now]) {
				if(!visited[a]) {
					queue.add(a);
					visited[a] = true;
				}
			}
		}
	}
}
