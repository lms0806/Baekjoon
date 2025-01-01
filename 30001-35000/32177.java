import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k, t;
	static int xp, yp, vp;
	static Node[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		xp = Integer.parseInt(st.nextToken());
		yp = Integer.parseInt(st.nextToken());
		vp = Integer.parseInt(st.nextToken());
		
		arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<Node> queue = new LinkedList<>();
		boolean[] check = new boolean[n];
		
		queue.add(new Node(xp, yp, vp, 0));
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			for(int i = 0; i < n; i++) {
				if(check[i]) {
					continue;
				}
				
				double dist = Math.sqrt(Math.pow(now.x - arr[i].x, 2) + Math.pow(now.y - arr[i].y, 2));
				
				if(dist <= k && Math.abs(now.version - arr[i].version) <= t) {
					check[i] = true;
					queue.add(new Node(arr[i].x, arr[i].y, arr[i].version, arr[i].have));
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(check[i] && arr[i].have == 1) {
				sb.append(i + 1).append(" ");
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}

class Node {
	int x, y, version, have;
	
	public Node(int x, int y, int version, int have) {
		this.x = x;
		this.y = y;
		this.version = version;
		this.have = have;
	}
}
