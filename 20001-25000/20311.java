import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		boolean flag = false;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= k; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num > (n + 1) >> 1) {
				flag = true;
				break;
			}
			pq.add(new Node(i, num));
		}
		
		System.out.print(flag ? -1 : solve(pq));
	}
	
	public static String solve(PriorityQueue<Node> pq) {
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			sb.append(now.idx).append(" ");
			now.count--;
			
			if(!pq.isEmpty()) {
				Node next = pq.poll();
				sb.append(next.idx).append(" ");
				next.count--;
				
				if(next.count != 0) {
					pq.add(next);
				}
			}
			
			if(now.count != 0) {
				pq.add(now);
			}
		}
		return sb.toString();
	}
}

class Node implements Comparable<Node> {
	int idx, count;
	
	public Node(int idx, int count) {
		this.idx = idx;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		if(o.count == this.count) {
			return this.idx - o.idx;
		}
		return o.count - this.count;
	}
}
