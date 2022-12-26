import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			PriorityQueue<Node> pq = new PriorityQueue<>();
			
			for(int i = 0; i < n; i++) {
				pq.add(new Node(i + 1, 0));
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < c; i++) {
				int cost = Integer.parseInt(st.nextToken());
				
				Node now = pq.poll();
				
				sb.append(now.num).append(" ");
				
				pq.add(new Node(now.num, now.cost + cost));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int num, cost;
	
	public Node(int num, int cost) {
		this.num = num;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.cost == o.cost) {
			return this.num - o.num;
		}
		return this.cost - o.cost;
	}
}
