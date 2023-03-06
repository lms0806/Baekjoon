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
	static ArrayList<String>[] arr;
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int idx = 1;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			if(!map.containsKey(a)) {
				map.put(a, idx++);
			}
			if(!map.containsKey(b)) {
				map.put(b, idx++);
			}
			
			arr[map.get(a)].add(b);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			if(a == b || map.get(a) == null || map.get(b) == null) {
				sb.append("gg");
			}
			else if(bfs(b, a)) {
				sb.append(b);
			}
			else if(bfs(a, b)) {
				sb.append(a);
			}
			else {
				sb.append("gg");
			}
			
			sb.append(" ");
		}
		System.out.print(sb);
	}
	
	public static boolean bfs(String x, String y) {
		Queue<String> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		
		visited[map.get(x)] = true;
		queue.add(x);
		
		while(!queue.isEmpty()) {
			String now = queue.poll();
			
			for(String a : arr[map.get(now)]) {
				if(a.equals(y)) {
					return true;
				}
				
				if(!visited[map.get(a)]) {
					visited[map.get(a)] = true;
					queue.add(a);
				}
			}
		}
		
		return false;
	}
}
