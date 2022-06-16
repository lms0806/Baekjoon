import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, t;
	static Node[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[i] = new Node(a, b);
		}
		
		Arrays.sort(arr);
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(0, 0));
		boolean[] visited = new boolean[n];
		
		Comparator<Node> cp = (o1, o2) ->{
			if(o1.y < o2.y) {
				return -1;
			}
			if(o1.y > o2.y) {
				return 1;
			}
			return o1.x < o2.x ? -1 : o1.x > o2.x ? 1 : 0;
		};
		
		int answer = -1;
		while(!queue.isEmpty()) {
			answer++;
			
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				Node now = queue.poll();
				
				if(now.y == t) {
					return answer;
				}
				
				int idx = Arrays.binarySearch(arr, new Node(now.x - 2 < 0 ? 0 : now.x - 2, now.y - 2 < 0 ? 0 : now.y - 2), cp);
				idx = idx < 0 ? -idx - 1 : idx;
				
				for(int j = idx; j < n; j++) {
					if(now.y - arr[j].y < -2) {
						break;
					}
					if(!visited[j] && Math.abs(now.x - arr[j].x) <= 2 && now.y - arr[j].y <= 2) {
						queue.add(new Node(arr[j].x, arr[j].y));
						visited[j] = true;
					}
				}
			}
		}
		
		return -1;
	}
}
class Node implements Comparable<Node>{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.y < o.y ? -1 : this.y > o.y ? 1 : this.x < o.x ? -1 : 1;
	}
}
