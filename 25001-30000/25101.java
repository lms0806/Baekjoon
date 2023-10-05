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
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			pq.add(new Node(i, Integer.parseInt(st.nextToken())));
		}
		
		boolean flag = true;
		while(k --> 0) {
			if(pq.peek().cost > 100) {
				pq.add(new Node(pq.peek().idx, pq.poll().cost - 100));
			}
			else {
				flag = false;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(flag) {
			int[] arr = new int[n];
			while(!pq.isEmpty()) {
				arr[pq.peek().idx] = pq.poll().cost;
			}
			
			for(int a : arr) {
				sb.append(a).append(" ");
			}
		}
		
		System.out.print(flag ? sb : "impossible");
	}
}

class Node implements Comparable<Node>{
	int idx, cost;
	
	public Node(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		if(o.cost == this.cost) {
			return this.idx - o.idx;
		}
		return o.cost - this.cost;
	}
}
