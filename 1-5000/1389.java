import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, count;
	static boolean[] visited;
	static int[] check;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			arr[start].add(end);
			arr[end].add(start);
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			int sum = 0;
			for(int j = 1; j <= n; j++) {
				if(i != j) {
					visited = new boolean[n + 1];
					check = new int[n + 1];
					sum += bfs(i, j);
				}
			}
			
			if(min > sum) {
				answer.clear();
				min = sum;
				answer.add(i);
			}
		}
		System.out.print(answer.get(0));
	}
	
	public static int bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();

			if(now == end) {
				return check[now];
			}
			
			count++;
			for(int temp : arr[now]) {
				if(!visited[temp]) {
					check[temp] = check[now] + 1;
					queue.add(temp);
					visited[temp] = true;
				}
			}
		}
		return 0;
	}
}
